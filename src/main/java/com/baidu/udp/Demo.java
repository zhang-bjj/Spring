package com.baidu.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @ClassName: Demo UDP发送端
 * @Description: TODO
 * @Author: zhangguohao
 * @Date: 2020/12/9 10:08
 * @Version: 1.0
 **/
public class Demo {

    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();

        byte[] bytes = "hello".getBytes();
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.9.27"), 10086);

        socket.send(dp);

        socket.close();
    }

}
