package org.zh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zh.service.RedisService;

/**
 * Created by ZhaoHang on 2017/4/13.
 */
@Controller
@RequestMapping(value = "/")
public class TestController {

    @Autowired
    private RedisService redisService;

    @RequestMapping
    @ResponseBody
    public String testHello(){
        return "Test";
    }

    @RequestMapping(value = "/get")
    @ResponseBody
    public String get(){

        Object o = redisService.get("Test");
        return o.toString();

    }


    @RequestMapping(value = "/set")
    @ResponseBody
    public String set(){

        redisService.set("Test","Test");
        return "设置成功";

    }

}
