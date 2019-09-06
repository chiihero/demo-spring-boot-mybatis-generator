package com.chii.demo.controller;


import com.chii.demo.mapper.UserMapper;
import com.chii.demo.pojo.User;
import com.chii.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    UserMapper userMapper;

    @GetMapping("/user")
    public User user(){
        return userMapper.selectByPrimaryKey("chii");
    }

    @GetMapping("/hello")
    public String hello() {
        System.out.println("hello");
        return "hello moto";
    }

    @GetMapping("/user2")
    public User test() {
        User user = userService.getUserInfoByUsername("chii");
        System.out.println(user.getPasswd());
        return user;
    }
}
