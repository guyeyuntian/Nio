package com.aio.test.server;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;

/**
 * Created by sunxuechao on 2017/2/16.
 */
public class AcceptAompletionHandler implements java.nio.channels.CompletionHandler<java.nio.channels.AsynchronousSocketChannel,  AsyncTimerServerHandler> {

    @Override
    public void completed(AsynchronousSocketChannel result, AsyncTimerServerHandler attachment) {
        attachment.asynchronousServerSocketChannel.accept(attachment, this);
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        result.read(buffer, buffer, new ReadCompletionHandler(result));
    }

    @Override
    public void failed(Throwable exc, AsyncTimerServerHandler attachment) {
        exc.printStackTrace();
        attachment.latch.countDown();
    }
}
