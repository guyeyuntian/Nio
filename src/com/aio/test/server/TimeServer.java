package com.aio.test.server;

/**
 * Created by sunxuechao on 2017/2/16.
 */
public class TimeServer {
    public static void main(String[] args) {
        int port = 8080;
        if (args != null && args.length > 0) {
            try {
                port = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        AsyncTimerServerHandler timeServer = new AsyncTimerServerHandler(port);
        new Thread(timeServer, "AIO-AsyncTImerServerHandler-001").start();
    }
}
