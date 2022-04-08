package com.baidu.persion;

import java.io.*;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * @ClassName: Demo
 * @Description: TODO
 * @Author: zhangguohao
 * @Date: 2020/12/2 9:39
 * @Version: 1.0
 **/
public class Demo {

    public static void main(String[] args) throws IOException {
        Designer designer = new Designer("zhangsan", "26", 90);
        Persion dg = new Designer("lisi", "24", 99);
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

//        InputStream in = System.in;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*int by;
        while ((by=in.read())!=-1) {
            System.out.print((char)by);
        }*/

        System.out.print("请输入：");
        String s = br.readLine();
        System.out.println("输出结果：" + s);
        /*TreeSet<Persion> ts = new TreeSet<Persion>(new Comparator<Persion>() {
            @Override
            public int compare(Persion p1, Persion p2) {
                int num = p2.getSum() - p1.getSum();
                return num;
            }
        });*/
    }

    public static void methods() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\dell\\Pictures\\img\\111.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\dell\\Pictures\\111.jpg"));

        byte[] bs = new byte[1024];
        int len;
        while ((len = bis.read(bs)) != -1) {
            bos.write(bs, 0, len);
//            System.out.print(new String(bs, 0, len));
        }

        bos.close();
        bis.close();
    }

}
