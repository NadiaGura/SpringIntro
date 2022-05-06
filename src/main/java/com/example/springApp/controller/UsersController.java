package com.example.springApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsersController {

    //register page
    @GetMapping("/register")
    public String getRegisteredPage(){
        return "register_page";
    }

    //login page
    @GetMapping("/login")
    public String getLoginPage(){
        return "login_page";
    }
}
