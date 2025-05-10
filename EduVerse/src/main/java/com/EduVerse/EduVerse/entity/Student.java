package com.EduVerse.EduVerse.entity;

import com.EduVerse.EduVerse.enums.StudentLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class Student extends Person {

    private String id;

    public StudentLevel getLevel() {
        return level;
    }

    public void setLevel(StudentLevel level) {
        this.level = level;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private StudentLevel level;

    public Student(String firstName, String lastName, String fatherName, String motherName,
                   String phoneNumber, String address, String bloodGroup, LocalDate dateOfBirth,
                   String id, StudentLevel level) {
        super(firstName, lastName, fatherName, motherName, phoneNumber, address, bloodGroup, dateOfBirth);
        this.id = id;
        this.level = level;
    }

}