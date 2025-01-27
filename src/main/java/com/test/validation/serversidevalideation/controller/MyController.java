package com.test.validation.serversidevalideation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.validation.serversidevalideation.entites.UserData;

import jakarta.validation.Valid;

@Controller
public class MyController {
    @GetMapping("/form")
    public String getForm(Model model) {
        model.addAttribute("user", new UserData());
        return "form";
    }

    @PostMapping("/process")
    public String processForm(@Valid @ModelAttribute("user") UserData user, BindingResult result) {
        if (result.hasErrors()) {
            System.out.println(result);
            return "form";
        }
        System.out.println(user);
        return "process";
    }
}
