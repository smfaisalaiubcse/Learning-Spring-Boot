package com.example.ums.api;

import com.example.ums.entity.Student;
import com.example.ums.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api")
@Validated
public class StudentApi {

    private static final Logger logger = Logger.getLogger(StudentApi.class.getName());

    private final StudentService studentService;

    public StudentApi(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Student> getAll() {
        logger.severe("Get all students");
        return this.studentService.getAll();
    }

    @GetMapping("/students/{id}")
    public Student getById(@PathVariable int id) {
        return studentService.getStudent(id);
    }

    @PostMapping("/students")
    public void save(@Valid @RequestBody Student student, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            logger.severe(Objects.requireNonNull(bindingResult.getFieldError()).getDefaultMessage());
        } else {
            studentService.save(student);
        }
    }

    @PutMapping("/students/{id}")
    public void update(@RequestBody Student student, @PathVariable int id) {
        student.setId(id);
        studentService.update(student);
    }

    @DeleteMapping("/students/{id}")
    public void delete(@PathVariable int id) {
        studentService.delete(id);
    }

    @GetMapping("/students/withCourse/{id}")
    public Student getStudentWithCourse(@PathVariable int id) {
        return studentService.getStudentByCourse(id);
    }
}
