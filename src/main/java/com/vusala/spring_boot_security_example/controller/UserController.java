package com.vusala.spring_boot_security_example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/index")
    public String index() {
        return "Welcome my page";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "Successfully login";
    }
}
