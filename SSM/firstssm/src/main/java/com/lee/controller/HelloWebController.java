package com.lee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author cvLee
 * @Description //TODO
 * @Date 2019-09-26 09:52
 **/
@Controller
@RequestMapping("web")
public class HelloWebController {

    @RequestMapping("helloweb")
    public String openHelloWeb(){
        return "Hello";
    }
}
