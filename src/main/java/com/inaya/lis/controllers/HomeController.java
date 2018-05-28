package com.inaya.lis.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/about")
    public String about() {
        return "home/about";
    }
}
