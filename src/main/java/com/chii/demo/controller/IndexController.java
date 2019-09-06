package com.chii.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by hhh on 2019/9/6 22:56
 */
@Controller
public class IndexController {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    String test(HttpServletRequest request) {
        //逻辑处理
        return "index";
    }
}
