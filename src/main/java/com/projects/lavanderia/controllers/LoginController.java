package com.projects.lavanderia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.servlet.ModelAndView;

import com.projects.lavanderia.dto.PersonDTO;
import com.projects.lavanderia.services.PersonService;

@RestController
@RequestMapping(value = {"/login", "/login/"})
public class LoginController {

    @Autowired
    PersonService personService;

    @GetMapping
    public ModelAndView loginForm() {
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }

    @PostMapping
    public PersonDTO validateLogin(@RequestParam("username") String username,
        @RequestParam("password") String password) {
        return personService.findByUsernameAndPassword(username, password);
    }
}