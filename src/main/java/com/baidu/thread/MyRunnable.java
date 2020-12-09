package com.baidu.thread;

/**
 * @ClassName: My
 * @Description: TODO
 * @Author: zhangguohao
 * @Date: 2020/12/8 16:23
 * @Version: 1.0  可以有自己的父类
 **/
public class MyRunnable implements Runnable {

    private Object obj = new Object();

    @Override
    public void run() {
        synchronized (obj) {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }

}
