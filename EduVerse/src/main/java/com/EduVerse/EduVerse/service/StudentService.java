package com.EduVerse.EduVerse.service;

import com.EduVerse.EduVerse.entity.Student;
import com.EduVerse.EduVerse.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student addStudent(Student student) {
        if (student.getId() == null || student.getId().isBlank()) {
            student.setId(UUID.randomUUID().toString());
        }
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(String id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
    }

    public void deleteStudent(String id) {
        studentRepository.deleteById(id);
    }

    public Student updateStudent(String id, Student updatedStudent) {
        Student existing = getStudentById(id);
        updatedStudent.setId(id);
        return studentRepository.save(updatedStudent);
    }
}