package com.epam.spring.restdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class DemoRestController {

    @GetMapping({"", "/"})
    public String getIndex(){
        return "index";
    }
}
