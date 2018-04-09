package com.xiawan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by key. on 2018/3/26.
 */
@Controller
public class HomeController {

    @RequestMapping("/{pageName}")
    public String home(@PathVariable String pageName){
        return "blog/"+pageName;
    }
}
