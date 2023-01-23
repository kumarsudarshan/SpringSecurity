package com.learn.spring.security.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String hello(Principal user){ // Spring class representing user
        return "Hello there " + user.getName();
    }

    @GetMapping("/get_name")
    public String getName(){        // getContext() - ThreadLocal
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "Hello there " + authentication.getName();
    }
}
