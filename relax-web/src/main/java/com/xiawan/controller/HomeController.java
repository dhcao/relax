package com.xiawan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2018/3/26.
 */
@Controller
public class HomeController {

    @ResponseBody
    @RequestMapping("/home")
    public String home(){
        return "hahaha";
    }
}
