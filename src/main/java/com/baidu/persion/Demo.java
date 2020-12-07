package com.baidu.persion;

import java.io.*;

/**
 * @ClassName: Demo
 * @Description: TODO
 * @Author: zhangguohao
 * @Date: 2020/12/2 9:39
 * @Version: 1.0
 **/
public class Demo {

    public static void main(String[] args){
        Designer designer = new Designer("zhangsan", "26");
        Persion dg = new Designer("lisi", "24");
        designer.show();

        long startTime = System.currentTimeMillis();
        try {
            methods();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("复制异常");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("总计耗时:" + (endTime - startTime) + "毫秒");
    }

    public static void methods() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\dell\\Pictures\\img\\111.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\dell\\Pictures\\111.jpg"));

        byte[] bs = new byte[1024];
        int len;
        while ((len = bis.read(bs)) != -1) {
            bos.write(bs, 0, len);
        }

        bos.close();
        bis.close();
    }

}
