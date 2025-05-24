package com.StudentManagement.StudentManagement.service;

import com.StudentManagement.StudentManagement.entity.Student;
import com.StudentManagement.StudentManagement.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentServices {
    private StudentRepository studentRepository;

    public StudentServices(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAll() {
        return studentRepository.getAll();
    }

    public Student get(String id) {
        return studentRepository.get(id);
    }

    public void save(Student student) {
        studentRepository.save(student);
    }

    public void update(Student student, String id) {
        student.setId(id);
        studentRepository.update(student);
    }

    public void delete(String id) {
        studentRepository.delete(id);
    }
}
