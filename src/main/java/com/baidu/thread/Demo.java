package com.baidu.thread;

/**
 * @ClassName: Demo
 * @Description: TODO
 * @Author: zhangguohao
 * @Date: 2020/12/8 15:59
 * @Version: 1.0
 **/
public class Demo {

    public static void main(String[] args) {
////        MyThread mt1 = new MyThread("刘备");
////        MyThread mt2 = new MyThread("关羽");
////        MyThread mt3 = new MyThread("张飞");
//
//        MyThread mt1 = new MyThread("康熙");
//        MyThread mt2 = new MyThread("四阿哥");
//        MyThread mt3 = new MyThread("八阿哥");
//
//
////        //设置主线程
////        Thread.currentThread().getName("刘备");
////        //设置守护线程
////        mt2.setDaemon(true);
////        mt3.setDaemon(true);
//
//        mt1.start();
//        try {
//            mt1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        mt2.start();
//        mt3.start();

        Thread t1 = new Thread(new MyRunnable(), "林俊杰");
        Thread t2 = new Thread(new MyRunnable(), "薛之谦");

        t1.start();
        t2.start();
    }

}
