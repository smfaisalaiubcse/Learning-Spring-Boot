package com.StudentManagement.StudentManagement.api;

import com.StudentManagement.StudentManagement.entity.Student;
import com.StudentManagement.StudentManagement.service.StudentServices;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentApi {
    StudentServices studentServices;
    public StudentApi(StudentServices studentServices) {
        this.studentServices = studentServices;
    }

    @GetMapping("/students")
    public List<Student> getAll() {
        return studentServices.getAll();
    }

    @GetMapping("/students/{id}")
    public Student get(@PathVariable String id) {

        return studentServices.get(id);
    }

    @PostMapping("/students")
    public void save(@RequestBody @Valid Student student) {
        studentServices.save(student);
    }

    @PutMapping("/students/{id}")
    public void update(@RequestBody Student student, @PathVariable String id) {
        studentServices.update(student, id);
    }

    @DeleteMapping("/students/{id}")
    public void delete(@PathVariable String id) {
        studentServices.delete(id);
    }
}
