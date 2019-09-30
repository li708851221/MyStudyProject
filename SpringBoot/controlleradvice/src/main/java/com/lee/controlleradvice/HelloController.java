package com.lee.controlleradvice;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author cvLee
 * @Description //TODO
 * @Date 2019-09-29 11:28
 **/
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(Model model){
        Map<String, Object> map = model.asMap();
        System.out.println(map);
        return "Hello," +map.toString();
    }
}
