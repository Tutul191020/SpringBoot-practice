package com.tutul.demosb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/welcome")
    public String SayHi() {
        System.out.println("controller is called");
        return "Hi";
    }
}


