package com.jk.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class UserController {

    @RequestMapping("/hi")
    public String hi (){
        return "你好";
    }

}
