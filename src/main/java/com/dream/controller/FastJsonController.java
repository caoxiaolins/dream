package com.dream.controller;

import com.dream.domian.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Description:
 * User: caoxiaolin
 * Date: 2018-03-16
 * Time: 16:33
 */
@Api(value = "FastJson测试", tags = { "测试接口" })
@RestController
@RequestMapping("fastjson")
public class FastJsonController {
    @ApiOperation("获取用户信息")
    @ApiImplicitParam(name = "name", value = "用户名", dataType = "string", paramType = "query")
    @GetMapping("/test/{name}")
    public User test(@PathVariable("name") String name) {
        User user = new User();
        user.setId(1);
        user.setUserName(name);
        user.setPassword("jack123");
        user.setBirthday(new Date());
        return user;
    }
}