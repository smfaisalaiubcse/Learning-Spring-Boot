package com.EduVerse.EduVerse.mapper;

import com.EduVerse.EduVerse.dto.request.StudentRequest;
import com.EduVerse.EduVerse.dto.response.StudentResponse;
import com.EduVerse.EduVerse.entity.Student;

import java.util.UUID;

public class StudentMapper {

    public static Student toEntity(StudentRequest request) {
        Student student = new Student();
        student.setId(UUID.randomUUID().toString());
        student.setFirstName(request.getFirstName());
        student.setLastName(request.getLastName());
        student.setFatherName(request.getFatherName());
        student.setMotherName(request.getMotherName());
        student.setPhoneNumber(request.getPhoneNumber());
        student.setAddress(request.getAddress());
        student.setBloodGroup(request.getBloodGroup());
        student.setDateOfBirth(request.getDateOfBirth());
        student.setLevel(request.getLevel());
        return student;
    }

    public static StudentResponse toResponse(Student student) {
        return new StudentResponse(
                student.getId(),
                student.getFirstName() + " " + student.getLastName(),
                student.getLevel(),
                student.getDateOfBirth(),
                student.getPhoneNumber()
        );
    }
}