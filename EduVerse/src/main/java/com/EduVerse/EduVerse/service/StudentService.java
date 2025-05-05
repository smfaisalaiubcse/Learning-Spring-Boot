package com.EduVerse.EduVerse.service;

import com.EduVerse.EduVerse.entity.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class StudentService {

    private final List<Student> students = new ArrayList<>();

    public Student addStudent(Student student) {
        if (student.getId() == null || student.getId().isBlank()) {
            student.setId(UUID.randomUUID().toString()); // auto-generate unique ID
        }
        students.add(student);
        return student;
    }

    public List<Student> getAllStudents() {
        return students;
    }
}