package com.example.springinitializr.controller;

import com.example.springinitializr.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
    @RequestMapping(value = "/login")
    public Object login(@RequestParam String username, @RequestParam String password, User user) {

        return user;
    }

}
