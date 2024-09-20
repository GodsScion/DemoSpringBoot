package com.springboot.springbootweb.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class HomeController {
    
    @RequestMapping("/")
    public String greet() {
        return "Welcome to Spring Boot Demo!";
    }
    

}
