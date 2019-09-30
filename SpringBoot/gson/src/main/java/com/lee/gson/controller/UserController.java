package com.lee.gson.controller;

import com.lee.gson.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author cvLee
 * @Description //TODO
 * @Date 2019-09-25 15:42
 **/
@Controller
public class UserController {

    @ResponseBody
    @GetMapping("/user")
    public List<User> getAllUser(){
        List<User> users=new ArrayList<User>();
        for(int i=0;i<8;i++){
            User user=new User();
            user.setId((long)i);
            user.setUsername("LeeChangWei>>>"+i);
            user.setAddress("YuFuHe>>>"+i);
            user.setBirthday(new Date());
            users.add(user);
        }
        return users;
    }


}
