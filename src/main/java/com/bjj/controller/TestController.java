package com.bjj.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/task")
public class TestController {

    @ResponseBody
    @RequestMapping("/go/{i}")
    public void getTask(@PathVariable int i){
        getTask1(i);
    }

    @Scheduled(cron="*/2 * * * * ?")
    public void getTask1(int i){
        System.out.println("定时器: "+i++);
    }

}
