package com.EduVerse.EduVerse.dto.request;

import com.EduVerse.EduVerse.enums.StudentLevel;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentRequest {

    @NotBlank private String firstName;
    @NotBlank private String lastName;
    @NotBlank private String fatherName;
    @NotBlank private String motherName;
    @NotBlank private String phoneNumber;
    @NotBlank private String address;
    @NotBlank private String bloodGroup;
    @Past @NotNull private LocalDate dateOfBirth;
    @NotNull private StudentLevel level;
}