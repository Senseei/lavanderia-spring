package com.projects.lavanderia.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class IndexController {
    
    @GetMapping
    public String home() {
        return "Hello, there's no home yet.";
    }
}
