package com.bjj.controller;

import com.bjj.model.User;
import com.bjj.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/bjj")
    public String getUser() {
        return "不将就";
    }

    @RequestMapping("/demo")
    public String getDemo() {
        return "demo";
    }

    @PostMapping("add")
    @ResponseBody
    public int addUser(@RequestBody User user) {
        return userService.add(user);
    }

    @GetMapping("all")
    @ResponseBody
    public PageInfo findAllUser(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize) {

        return userService.findAllUser(pageNum,pageSize);
    }

    @GetMapping("get/{name}")
    @ResponseBody
    public PageInfo findByName(@PathVariable String name) {
        return userService.findByName(name);
    }

    @PostMapping("insert/batch")
    @ResponseBody
    public Integer insertBatch(@RequestBody List<User> userList) {
        return userService.insertBatch(userList);
    }

    @PostMapping("update/batch")
    @ResponseBody
    public Integer updateBatch(@RequestBody List<User> userList) {
        return userService.updateBatch(userList);
    }

}
