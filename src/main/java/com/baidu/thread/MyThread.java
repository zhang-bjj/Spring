package com.baidu.thread;

/**
 * @ClassName: MyThread
 * @Description: TODO
 * @Author: zhangguohao
 * @Date: 2020/12/8 16:00
 * @Version: 1.0
 **/
public class MyThread extends Thread {

    public MyThread() {

    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println(getName() + ": " + i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
