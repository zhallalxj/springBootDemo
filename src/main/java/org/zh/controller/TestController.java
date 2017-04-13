package org.zh.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    public String testHello(Model model) {
        model.addAttribute("info", "sdgsdgsdg");

        return "/index";
    }

    @RequestMapping(value = "/get/{key}", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String get(@PathVariable String key) {

        Object o = redisService.get(key);
        if (o != null)
            return new Gson().toJson(o.toString());
        return new Gson().toJson("");
    }


    @RequestMapping(value = "/set/{key}/{value}")
    @ResponseBody
    public String set(@PathVariable String key, @PathVariable String value) {

        redisService.set(key, value);
        return new Gson().toJson("设置成功");

    }

}
