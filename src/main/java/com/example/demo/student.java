package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class student {

    @GetMapping("/greet")
    public String greetUser(@RequestParam String name) {
        return "Hello " + name;
    }
}