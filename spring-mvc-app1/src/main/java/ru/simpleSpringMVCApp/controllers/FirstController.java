package ru.simpleSpringMVCApp.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
@RequestMapping("/f")
public class FirstController {

    @GetMapping("/hello") //URL get request
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model) { //inj model

        // System.out.println("Hello " + name + " " + surname);
        model.addAttribute("massage", "Hello " + name + " " + surname); //add data to model to kay massage

        return "first/hello"; //location views
    }

    @GetMapping("/goodbye")
    public String goodByePage() {
        return "first/goodbye";
    }
}
