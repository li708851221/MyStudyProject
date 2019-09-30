package com.lee.freemarker.controller;

import com.lee.freemarker.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author cvLee
 * @Description //TODO
 * @Date 2019-09-25 15:42
 **/
@Controller
public class UserController {

    @GetMapping("/user")
    public String user(Model model){
        List<User> users=new ArrayList<User>();
        for(int i=0;i<4;i++){
            User user=new User();
            user.setId((long)i);
            user.setUsername("LeeChangWei>>>"+i);
            user.setAddress("YuFuHe>>>"+i);
            users.add(user);
        }
        model.addAttribute("users",users);
        return "user";
    }


}
