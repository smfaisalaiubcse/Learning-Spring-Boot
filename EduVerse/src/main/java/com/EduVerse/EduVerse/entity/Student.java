package com.EduVerse.EduVerse.entity;

import com.EduVerse.EduVerse.enums.StudentLevel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Student extends Person {

    @Id
    private String id; // UUID generated manually

    @Enumerated(EnumType.STRING)
    private StudentLevel level;

    public Student(String firstName, String lastName, String fatherName, String motherName,
                   String phoneNumber, String address, String bloodGroup, LocalDate dateOfBirth,
                   String id, StudentLevel level) {
        super(firstName, lastName, fatherName, motherName, phoneNumber, address, bloodGroup, dateOfBirth);
        this.id = id;
        this.level = level;
    }
}