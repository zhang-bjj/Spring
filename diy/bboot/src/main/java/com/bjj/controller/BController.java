package com.bjj.controller;

import com.bjj.BService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BController {

    @Autowired
    private BService bService;

    @RequestMapping("/hello")
    public String show(){
        String hello = bService.sayHello("不将就");
        return hello;
    }

}
