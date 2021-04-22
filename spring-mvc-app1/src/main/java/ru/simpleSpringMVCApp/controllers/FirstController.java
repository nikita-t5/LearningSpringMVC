package ru.simpleSpringMVCApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/f")
public class FirstController {
    @GetMapping("/hello") //URL get request
    public String helloPage() {
        return "first/hello"; //location views
    }

    @GetMapping("/goodbye")
    public String goodByePage() {
        return "first/goodbye";
    }
}
