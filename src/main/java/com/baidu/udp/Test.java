package com.baidu.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @ClassName: Test UDP接收端
 * @Description: TODO
 * @Author: zhangguohao
 * @Date: 2020/12/9 10:17
 * @Version: 1.0
 **/
public class Test {

    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(10086);

        byte[] by = new byte[1024];
        DatagramPacket dp = new DatagramPacket(by, by.length);

        socket.receive(dp);

        System.out.println(new String(dp.getData(), 0, dp.getLength()));

        socket.close();
    }

}
