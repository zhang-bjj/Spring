package com.bjj.controller;

import com.bjj.service.MyFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class FeignController {
 
	@Autowired
	private MyFeignClient feignClient;
 
	@GetMapping(value = "/hi")
	public String sayHi(@RequestParam String name) {
		String result = this.feignClient.sayHiFromClientOne(name);
		return result;
	}
}