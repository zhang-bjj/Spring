package com.bjj.controller;

import com.bjj.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: TaskController
 * @Description: 任务调度的Controller
 * @Author: zhangguohao
 * @Date: 2020/7/20 10:29
 **/
@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    /**
     * 创建任务调度01
     */
    @RequestMapping("/add")
    public String add(String name){
        taskService.add(name);
        return "success";
    }
    /**
     * 创建任务调度02
     */
    @RequestMapping("/add02")
    public String add02(String name){
        taskService.add02(name);
        return "success";
    }

    /**
     * 创建任务调度
     */
    @RequestMapping("/touch")
    public String touch(String name){
        taskService.touch(name);
        return "success";
    }

    /**
     * 创建任务调度
     */
    @RequestMapping("/delete")
    public String delete(String name){
        taskService.delete(name);
        return "success";
    }

}
