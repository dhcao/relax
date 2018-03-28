package com.xiawan.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 登陆、注册、注销、查看个人信息
 * Created by dhcao on 2018/3/28.
 */
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/login")
    public String login(String username,String password){
        return null;
    }

}
