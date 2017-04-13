package org.zh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ZhaoHang on 2017/4/13.
 */
@Controller
@RequestMapping(value = "/")
public class TestController {

    @RequestMapping
    @ResponseBody
    public String testHello(){
        return "Test";
    }

}
