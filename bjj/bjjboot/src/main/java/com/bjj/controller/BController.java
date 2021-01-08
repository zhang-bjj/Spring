package com.bjj.controller;

import com.bjj.service.BService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: BController
 * @Description: TODO
 * @Author: zhangguohao
 * @Date: 2021/1/6 11:07
 * @Version: 1.0
 **/
@RestController
public class BController {

    @Autowired
    private BService bService;

    @RequestMapping("/bjj")
    public String show() {
        String show = bService.show();
        return show;
    }

}