package com.EduVerse.EduVerse.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)  // ✅ keep this
public abstract class Profile {

    @Id
    private String id;

    private String firstName;
    private String lastName;
    private String fatherName;
    private String motherName;
    private String phoneNumber;
    private String address;
    private String bloodGroup;
    private LocalDate dateOfBirth;
}