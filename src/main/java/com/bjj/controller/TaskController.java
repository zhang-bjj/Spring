package com.bjj.controller;

import com.bjj.model.User;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Component
public class TaskController {
    int i = 0;
    int m = 0;

    @Scheduled(cron="* * * * * ?")
    public void getTask1(){
        System.out.println("定时器: "+i++);
    }

    @Scheduled(cron="*/5 * * * * ?")
    public void getTask2(){
        System.out.println("不将就: "+m++);
    }

}
