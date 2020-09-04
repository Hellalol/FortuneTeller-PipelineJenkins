package com.example.fortuneteller.controller;
import com.example.fortuneteller.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FortuneController {

    //API


    @PostMapping("/person")
    public String personSubmit(@ModelAttribute Person person, Model model) {
        model.addAttribute("person", person);
        return "result";
    }

}
