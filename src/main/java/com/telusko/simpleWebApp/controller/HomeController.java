package com.telusko.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Add @Controller to let Spring boot know use this as Controller
@RestController
public class HomeController {

    // for http://localhost:8080 + "/"
    @RequestMapping("/")
    public String greet() {
        return "Welcome to yo ur nightmare";
    }

    // for http://localhost:8080 + "/about"
    @RequestMapping("/about")
    public String about() {
        return "We don't teach, we EDUCATE!!!";
    }
}
