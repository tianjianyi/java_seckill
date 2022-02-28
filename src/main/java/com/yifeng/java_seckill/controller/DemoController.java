package com.yifeng.java_seckill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("name", "yifeng");
        return "hello";
    }
}
