package com.EduVerse.EduVerse.entity;

import jakarta.persistence.MappedSuperclass;

import java.time.LocalDate;

@MappedSuperclass  // ✅ This is the key!
public abstract class Person {

    private String firstName;

    private String lastName;

    private String fatherName;

    private String motherName;

    private String phoneNumber;

    private String address;

    private String bloodGroup;

    private LocalDate dateOfBirth;

    // ✅ Default constructor for JPA/Lombok
    public Person() {
    }

    public Person(String firstName, String lastName, String fatherName, String motherName, String phoneNumber, String address, String bloodGroup, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.bloodGroup = bloodGroup;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}