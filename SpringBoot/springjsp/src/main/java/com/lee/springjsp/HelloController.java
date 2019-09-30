package com.lee.springjsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author cvLee
 * @Description //TODO
 * @Date 2019-09-26 15:19
 **/
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
