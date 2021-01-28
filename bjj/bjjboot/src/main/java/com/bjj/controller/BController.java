package com.bjj.controller;

import com.bjj.service.BService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Map;

/**
 * @ClassName: BController
 * @Description: TODO
 * @Author: zhangguohao
 * @Date: 2021/1/6 11:07
 * @Version: 1.0
 **/
@Controller
public class BController {

    @Autowired
    private BService bService;

    @RequestMapping("/bjj")
    public String show() {
        String show = bService.show();
        return show;
    }

    @RequestMapping("/t1")
    public String test1(Model model){
        //存入数据
        model.addAttribute("msg","Hello,Thymeleaf");
        //classpath:/templates/test.html
        return "test";
    }

    @RequestMapping("/t2")
    public String test2(Map<String,Object> map){
        //存入数据
        map.put("msg","<h1>Hello</h1>");
        map.put("users", Arrays.asList("qinjiang","kuangshen"));
        //classpath:/templates/test.html
        return "test";
    }

}