package com.nio.test.client;

import com.nio.test.server.MultiplexerTimeServer;

/**
 * Created by sunxuechao on 2017/2/14.
 */
public class TimeClient {
    public static void main(String[] args) {
        int port = 9882;
        if (args != null && args.length > 0) {
            try {
                port = Integer.valueOf(args[0]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        new Thread(new TimeClientHandle("127.0.0.1", port), "NIO-MultiplexerTimeClient").start();
    }
}
