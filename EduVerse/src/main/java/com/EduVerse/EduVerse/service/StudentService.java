package com.EduVerse.EduVerse.service;

import com.EduVerse.EduVerse.dto.request.StudentRequest;
import com.EduVerse.EduVerse.dto.response.StudentResponse;
import com.EduVerse.EduVerse.entity.Student;
import com.EduVerse.EduVerse.mapper.StudentMapper;
import com.EduVerse.EduVerse.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public StudentResponse addStudent(StudentRequest request) {
        Student student = StudentMapper.toEntity(request);
        student = studentRepository.save(student);
        return StudentMapper.toResponse(student);
    }

    public List<StudentResponse> getAllStudents() {
        return studentRepository.findAll()
                .stream()
                .map(StudentMapper::toResponse)
                .toList();
    }
}