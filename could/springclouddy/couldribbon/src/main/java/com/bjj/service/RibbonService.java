package com.bjj.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    public String hiService(String name) {
        String result = restTemplate.getForObject("http://couldbjj-provider-user/hi?name=" + name, String.class);
        System.out.println(result);
        return result;
    }
}