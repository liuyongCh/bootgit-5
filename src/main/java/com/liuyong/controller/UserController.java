package com.liuyong.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.liuyong.pojo.User;
import com.liuyong.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class UserController {
    @RequestMapping(value = "/g1")
    @ResponseBody //不会走视图解析器，直接返回字符串
    public String json1() throws JsonProcessingException {
        User user=new User(2017113118,"刘勇","男");
        return JsonUtils.getJson(new Date(),"yyyy-MM-dd HH:mm:ss");
    }
    public String test2(){
        User user=new User(2017113118,"刘勇","男");
        return JSON.toJSONString(user);
    }
}
