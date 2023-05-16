package com.projects.lavanderia.controllers;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

import com.projects.lavanderia.dto.PersonDTO;
import com.projects.lavanderia.services.PersonService;

import jakarta.servlet.http.HttpSession;

@Controller
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
    public String validateLogin(@RequestParam("username") String username,
        @RequestParam("password") String password, HttpSession session) {
        PersonDTO user = personService.findByUsernameAndPassword(username, password);
        if (!Objects.equals(user.getId(), null)) {
            session.setAttribute("user", user);
            return "redirect:/";
        }
        return "redirect:/login";
    }
}