package com.prepx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String home() {
        return "🚀 Welcome to PrepX – The Ultimate Interview Assistant!";
    }
}

