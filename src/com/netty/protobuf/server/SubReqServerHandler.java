package com.codec.server;

import com.codec.proto.SubscribeReqProto;
import com.codec.proto.SubscribeRespProto;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * Created by sunxuechao on 2017/2/26.
 */
public class SubReqServerHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        SubscribeReqProto.SubscribeReq req = (SubscribeReqProto.SubscribeReq) msg;
        System.out.println("Service accept client subscribe req : [" + req.toString() + "]");
        ctx.writeAndFlush(resp(req.getSubSeqID()));
    }

    private SubscribeRespProto.SubscribeResp resp(int subSeqID) {
        SubscribeRespProto.SubscribeResp.Builder builder = SubscribeRespProto.SubscribeResp.newBuilder();
        builder.setSubSeqID(subSeqID);
        builder.setRespCode(0);
        builder.setDesc("Netty boot order succeed, 3 days later, sent to the designated address");
        return builder.build();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close(); //发生异常，关闭链路
    }
}
