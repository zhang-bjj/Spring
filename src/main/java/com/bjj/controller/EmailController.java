package com.bjj.controller;

import com.bjj.model.BjjEmail;
import static com.bjj.util.EmailUtils.*;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bjj/c1")
public class EmailController {

    Logger log = LoggerFactory.getLogger(EmailController.class);

    Gson gson = new Gson();

    @RequestMapping(value = "/f01", method = RequestMethod.POST)
    public void email(@RequestBody BjjEmail bjjEmail){
        log.info("邮件发送入参-------------->{}", gson.toJson(bjjEmail));
        sendEmail(bjjEmail);
        log.info("------邮件发送成功------");
    }

}
