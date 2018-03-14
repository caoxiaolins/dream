package com.dream.controller;

import com.dream.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private static Logger logger = LoggerFactory.getLogger(HelloController.class);
    @Autowired
    private TestService testService;
    @RequestMapping("/hello")
    public String hello() {
        logger.info("hello");
//        Integer.valueOf("1.100");
        return "hello,this is a springboot demo";
    }
    @RequestMapping("/get")
    public Object getCount(){
        int count = testService.getCount();
        return count;
    }
}