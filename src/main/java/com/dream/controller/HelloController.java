package com.dream.controller;

import com.dream.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

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
    public Object getCount(HttpServletRequest request){

        Map res = new HashMap();
        res.put("1",null);
        res.put("date",new Date());
        res.put("2",11);
        res.put("3",11.001);
        System.out.println(request.getRequestURI());
        System.out.println(request.getPathInfo());
        System.out.println(request.getRequestURL());
        List list = new ArrayList();
        list.add(1);
        list.add(null);
        list.add(new Date());
        list.add("1");
        res.put("list",list);
        return res;
    }
}