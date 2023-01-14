package com.example.formValidation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.formValidation.model.User;

import jakarta.validation.Valid;

@Controller
@RequestMapping(path = "/register")
public class RegistrationController {

    @GetMapping
    public String getRegForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping
    public String postRegistration(@Valid User user, BindingResult binding, Model model) {
        if (binding.hasErrors()) {
            model.addAttribute("user", user);
            return "register";
        }
        return "thankyou";
    }
}
