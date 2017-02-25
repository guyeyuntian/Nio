package com.netty.fileservice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Pattern;

import javax.activation.MimetypesFileTypeMap;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpHeaderNames;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.HttpVersion;
import io.netty.util.CharsetUtil;

public class HttpFileServerHandler extends SimpleChannelInboundHandler<FullHttpRequest> {
    private static final String CRLF = "\r\n";
    private String localDir;

    private static SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
    private static final Pattern INSECURE_URI = Pattern.compile(".*[<>&\"].");

    public HttpFileServerHandler(String localDir) {
        this.localDir = localDir;
    }

    //public static final HttpVersion HTTP_1_1 = new HttpVersion("HTTP", 1, 1, true);


    @Override
    protected void channelRead0(ChannelHandlerContext ctx, FullHttpRequest request) throws Exception {
        //解码不成功
        if (!request.decoderResult().isSuccess()) {
            sendErrorToClient(ctx, HttpResponseStatus.BAD_REQUEST);
            return;
        }
        if (request.method().compareTo(HttpMethod.GET) != 0) {
            sendErrorToClient(ctx, HttpResponseStatus.METHOD_NOT_ALLOWED);
            return;
        }
        String uri = request.uri();
        String filePath = getFilePath(uri);
        if (filePath == null) {
            sendErrorToClient(ctx, HttpResponseStatus.FORBIDDEN);
            return;
        }
        File file = new File(filePath);
        //如果文件不存在
        if (!file.exists() || file.isHidden()) {
            sendErrorToClient(ctx, HttpResponseStatus.NOT_FOUND);
            return;
        }
        //如果是目录，则显示子目录
        if (file.isDirectory()) {
            if (uri.endsWith("/")) {
                sendDirListToClient(ctx, file, uri);
            } else {
                sendRedirct(ctx, uri + '/');
            }
            return;
        }
        //如果是文件，则将文件流写到客户端
        if (file.isFile()) {
            sendFileToClient(ctx, file, uri);
            return;
        }
        ctx.close();
    }

    private void sendRedirct(ChannelHandlerContext ctx, String newUri) {
        FullHttpResponse response = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.FOUND);
        response.headers().set(HttpHeaderNames.LOCATION, newUri);
        ctx.writeAndFlush(response).addListener(ChannelFutureListener.CLOSE);
    }

    public String getFilePath(String uri) throws Exception {
        try {
            uri = URLDecoder.decode(uri, "utf-8");
        } catch (UnsupportedEncodingException e) {
            try {
                uri = URLDecoder.decode(uri, "ISO-8859-1");
            } catch (UnsupportedEncodingException e1) {
                e1.printStackTrace();
            }
        }
        if (!uri.startsWith(localDir)) {
            return null;
        }
        if (!uri.startsWith("/")) {
            return null;
        }
        uri = uri.replace('/', File.separatorChar);
        if (uri.contains(File.separator + '.') || uri.contains("." + File.separatorChar) || uri.startsWith(".") ||
                uri.endsWith(".") || INSECURE_URI.matcher(uri).matches()) {
            return null;
        }
        return System.getProperty("user.dir") + File.separator + uri;
    }

    private void sendErrorToClient(ChannelHandlerContext ctx, HttpResponseStatus status) throws Exception {
        ByteBuf buffer = Unpooled.copiedBuffer(("系统服务出错：" + status.toString() + CRLF).getBytes("utf-8"));
        FullHttpResponse response = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, status, buffer);
        response.headers().set(HttpHeaderNames.CONTENT_TYPE, "text/html;charset=utf-8");
        ctx.writeAndFlush(response).addListener(ChannelFutureListener.CLOSE);
    }

    private void sendDirListToClient(ChannelHandlerContext ctx, File dir, String uri) throws Exception {
        StringBuffer sb = new StringBuffer("");
        String dirpath = dir.getPath();
        sb.append("<!DOCTYPE HTML>" + CRLF);
        sb.append("<html><head><title>");
        sb.append(dirpath);
        sb.append("目录：");
        sb.append("</title></head><body>" + CRLF);
        sb.append("<h3>");
        sb.append("当前目录:" + dirpath);
        sb.append("</h3>");
        sb.append("<table>");
        sb.append("<tr><td colspan='3'>上一级: <a href=\"../\">..</a>  </td></tr>");
        if (uri.equals("/")) {
            uri = "";
        } else {
            if (uri.charAt(0) == '/') {
                uri = uri.substring(0);
            }
            uri += "/";
        }

        String fnameShow;
        for (File f : dir.listFiles()) {
            if (f.isHidden() || !f.canRead()) {
                continue;
            }
            String fname = f.getName();
            Calendar cal = Calendar.getInstance();
            cal.setTimeInMillis(f.lastModified());
            String lastModified = sdf.format(cal.getTime());
            sb.append("<tr>");
            if (f.isFile()) {
                fnameShow = "<font color='green'>" + fname + "</font>";
            } else {
                fnameShow = "<font color='red'>" + fname + "</font>";
            }
            sb.append("<td style='width:200px'> " + lastModified + "</td><td style='width:100px'>" + Files.size(f.toPath()) + "</td><td><a href=\"" + uri + fname + "\">" + fnameShow + "</a></td>");
            sb.append("</tr>");

        }
        sb.append("</table>");
        ByteBuf buffer = Unpooled.copiedBuffer(sb.toString(), CharsetUtil.UTF_8);
        FullHttpResponse resp = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.OK, buffer);
        resp.headers().set(HttpHeaderNames.CONTENT_TYPE, "text/html;charset=utf-8");
        ctx.writeAndFlush(resp).addListener(ChannelFutureListener.CLOSE);
    }

    private void sendFileToClient(ChannelHandlerContext ctx, File file, String uri) throws Exception {
//        RandomAccessFile randomAccessFile = null;
//        try {
//            randomAccessFile = new RandomAccessFile(file,"r");
//        } catch (FileNotFoundException e) {
//            sendErrorToClient(ctx, HttpResponseStatus.NOT_FOUND);
//            return;
//        }
        MimetypesFileTypeMap mimeTypeMap = new MimetypesFileTypeMap();
        ByteBuf buffer = Unpooled.copiedBuffer(Files.readAllBytes(file.toPath()));
        FullHttpResponse response = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.OK, buffer);
        response.headers().set(HttpHeaderNames.CONTENT_TYPE, mimeTypeMap.getContentType(file.getPath()));
        ctx.writeAndFlush(response).addListener(ChannelFutureListener.CLOSE);
    }


    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }


}
