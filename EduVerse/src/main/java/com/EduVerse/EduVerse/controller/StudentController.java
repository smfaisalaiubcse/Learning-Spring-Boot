package com.EduVerse.EduVerse.controller;

import com.EduVerse.EduVerse.dto.request.StudentRequest;
import com.EduVerse.EduVerse.dto.response.StudentResponse;
import com.EduVerse.EduVerse.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public StudentResponse addStudent(@Valid @RequestBody StudentRequest request) {
        return studentService.addStudent(request);
    }

    @GetMapping
    public List<StudentResponse> getAllStudents() {
        return studentService.getAllStudents();
    }
}