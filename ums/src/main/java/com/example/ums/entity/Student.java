package com.example.ums.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public class Student {

    @NotNull
    private Integer id;

    @NotNull
    @Email
    private String email;

    private Course course;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}


