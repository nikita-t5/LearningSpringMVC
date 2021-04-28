package ru.simpleSpringMVCApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ThirdController {
    @GetMapping("/calculator")
    public String calculate(@RequestParam(value = "a", required = false) int a,
                            @RequestParam(value = "b", required = false) int b,
                            @RequestParam(value = "action", required = false) String action,
                            Model model) {
        double result;

        switch (action) {
            case "add":
                result = a + b;
                break;
            case "sub":
                result = a - b;
                break;
            default:
                result = 0;
                break;
        }
        model.addAttribute("answer", result);
        return "third/calculator";
    }

}
