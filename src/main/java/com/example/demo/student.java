package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/greet")

public class student{


    @PostMapping("/add")
    public String addName(@RequestBody String entity) {
        
        return "Hello" + entity;
    }
    
}

