package com.EduVerse.EduVerse.controller;

import com.EduVerse.EduVerse.entity.Student;
import com.EduVerse.EduVerse.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // ✔️ Add a new student
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    // ✔️ View all students
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
    @GetMapping("/{id}")
    public Student getStudent(@PathVariable String id) {
        return studentService.getStudentById(id);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable String id, @RequestBody Student student) {
        return studentService.updateStudent(id, student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable String id) {
        studentService.deleteStudent(id);
    }
    // ✔️ Simple test endpoint (optional)
    @GetMapping("/test")
    public String test() {
        return "<h1>Hello from StudentController!</h1>";
    }
}