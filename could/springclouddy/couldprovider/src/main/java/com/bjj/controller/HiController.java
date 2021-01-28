package com.bjj.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HiController {

    @Value("${server.port}")
    String port;

    @Autowired
    private RestTemplate restTemplate;

    // 提供的方法
    @RequestMapping("/hi")
    public String hi(@RequestParam(value = "name", defaultValue = "bjj") String name) {
        String result = "hi " + name + " , i am from port:" + port;
        System.out.println(result);
        return result;
    }

    // 提供的方法
    @RequestMapping("/ha")
    public String ha(@RequestParam String name) {
        String result = restTemplate.getForObject("http://couldbjj-consumer-ribbon/hi?name=" + name, String.class);
        System.out.println("ba" + result);
        return result;
    }
}