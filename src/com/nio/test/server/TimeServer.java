package com.nio.test.server;

import com.nio.test.server.MultiplexerTimeServer;

/**
 * Created by sunxuechao on 2017/2/14.
 */
public class TimeServer {
    public static void main(String[] args) {
        int port = 9882;
        if (args != null && args.length > 0) {
            try {
                port = Integer.valueOf(args[0]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        MultiplexerTimeServer timeServer = new MultiplexerTimeServer(port);
        new Thread(timeServer, "NIO-MultiplexerTimeServer").start();
    }
}
