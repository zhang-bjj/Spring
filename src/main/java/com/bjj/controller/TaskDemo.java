package com.bjj.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class TaskDemo {
    int i = 0;
    int m = 0;

    @Scheduled(cron="* * * * 1 ?")
    public void getTask1(){
        System.out.println("定时器: "+i++);
    }

    @Scheduled(cron="*/5 * * * 1 ?")
    public void getTask2(){
        System.out.println("不将就: "+m++);
    }

}
