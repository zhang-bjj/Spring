package com.baidu.notebook;

/**
 * @ClassName: Demo
 * @Description: TODO
 * @Author: zhangguohao
 * @Date: 2020/12/2 16:43
 * @Version: 1.0
 **/
public class Demo {

    public static void main(String[] args) {
        MacBook macBook = new MacBook();
        MacBook macBook2 = new MacBook();
//        MacBook.CPU cpu = new MacBook().new CPU();
        macBook.methods();
//        cpu.use();
        MacBook.str = "macbook";
//        System.exit(0);
        System.out.println(macBook);

        System.out.println(macBook.equals(macBook2));

        String a = new String("123");
        String b = new String("123");
        System.out.println(a.equals(b));

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            System.out.printf("");
        }

        long end = System.currentTimeMillis();
        System.out.println(end-start);
        System.out.println(Math.abs(-123));

//        Integer integer = new Integer(100);
        Integer integer = Integer.valueOf(100);
        Integer integer1 = Integer.valueOf("200");
        System.out.println(integer);
        System.out.println(integer1);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }

}
