package com.apollo.springboottest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        System.out.println("TEST AOP");
        return "Hello World!";
    }


    @GetMapping("/thymeleaf")
    public String thymeleaf(Model model) {
        model.addAttribute("name", "ttz");
        return "thymeleaf";
    }






}
