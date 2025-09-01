package com.example.springstate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExampleController {

    @GetMapping("/hello")
    public String hello(Model model) {
        // ${message}
        model.addAttribute("message", "안녕 나는 모델이야");
        // ${userName}
        model.addAttribute("userName", "모델");
        return "hello"; // src/main/resources/templates/hello.html
    }
}
