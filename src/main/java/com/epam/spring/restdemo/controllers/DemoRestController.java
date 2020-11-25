package com.epam.spring.restdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DemoRestController {

    @GetMapping({"", "/"})
    public String sayHello(){
        return "Hello, World!";
    }
}