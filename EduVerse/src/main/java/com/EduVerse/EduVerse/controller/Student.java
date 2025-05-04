package com.EduVerse.EduVerse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student {
    @GetMapping("/test")
    public String test() {
        return "<h1>Hello, this is a test response from the StudentController 1!</h1>";
    }
    @GetMapping("/tests")
    public String tests() {
        return "Hello, this is a test response from the StudentController!";
    }
}
