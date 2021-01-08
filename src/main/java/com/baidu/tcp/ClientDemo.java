package com.baidu.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @ClassName: ClientDemo
 * @Description: TODO
 * @Author: zhangguohao
 * @Date: 2020/12/9 10:53
 * @Version: 1.0
 **/
public class ClientDemo {


    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.9.27", 8111);

        OutputStream os = socket.getOutputStream();
        os.write("BJJ".getBytes());

        InputStream is = socket.getInputStream();
        byte[] by = new byte[1024];
        int i = is.read(by);
        System.out.println("客户端：" + new String(by, 0, i));


//        os.close();
        socket.close();
    }

}
