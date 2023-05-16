package com.projects.lavanderia.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projects.lavanderia.dto.PersonDTO;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping(value = "/")
public class IndexController {
    
    @GetMapping
    public PersonDTO home(HttpSession session) {
        return (PersonDTO) session.getAttribute("user");
    }
}
