package com.baidu.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName: ServerDemo
 * @Description: TODO
 * @Author: zhangguohao
 * @Date: 2020/12/9 10:55
 * @Version: 1.0
 **/
public class ServerDemo {

    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(8111);

        Socket a = socket.accept();

        InputStream is = a.getInputStream();
        byte[] by = new byte[1024];
        int i = is.read(by);
        System.out.println("服务端:" + new String(by, 0, i));

        OutputStream os = a.getOutputStream();
        os.write("数据已接收".getBytes());

//        is.close();
        socket.close();
    }

}
