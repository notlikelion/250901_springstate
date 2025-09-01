package com.example.springstate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

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

    @PostMapping("/save-data")
    public String saveData(@RequestParam String data, Model model) {
        Random rd = new Random();
        boolean success = rd.nextBoolean(); // 반반 확률
        if (success) {
            model.addAttribute("message", data + "가 성공적으로 저장되었습니다.");
        } else {
            model.addAttribute("message", data + "의 저장에 실패했습니다.");
        }
//        return "result";
        return "redirect:/result";
    }

    @GetMapping("/result")
    public String result() {
        return "result";
    }
}
