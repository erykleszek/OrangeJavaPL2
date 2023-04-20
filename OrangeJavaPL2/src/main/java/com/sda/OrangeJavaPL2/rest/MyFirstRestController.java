package com.sda.OrangeJavaPL2.rest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstRestController {

    @GetMapping("/hello-world")
    public String hello(){
        return "Hello String";
    }
}
