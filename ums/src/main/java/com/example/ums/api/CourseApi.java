package com.example.ums.api;

import com.example.ums.entity.Course;
import com.example.ums.entity.Student;
import com.example.ums.service.CourseService;
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
public class CourseApi {

    private final CourseService courseService;

    public CourseApi(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/courses")
    public List<Course> getAll() {
        return this.courseService.getAll();
    }

    @GetMapping("/courses/{id}")
    public Course getById(@PathVariable int id) {
        return courseService.getCourse(id);
    }

    @PostMapping("/courses")
    public void save(@Valid @RequestBody Course course, BindingResult bindingResult) {
        courseService.save(course);

    }

    @PutMapping("/courses/{id}")
    public void update(@RequestBody Course course, @PathVariable int id) {
        course.setId(id);
        courseService.update(course);
    }

    @DeleteMapping("/courses/{id}")
    public void delete(@PathVariable int id) {
        courseService.delete(id);
    }
}
