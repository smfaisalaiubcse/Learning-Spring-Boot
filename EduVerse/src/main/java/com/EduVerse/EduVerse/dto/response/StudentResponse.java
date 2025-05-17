package com.EduVerse.EduVerse.dto.response;

import com.EduVerse.EduVerse.enums.StudentLevel;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentResponse {
    private String id;
    private String fullName;
    private StudentLevel level;
    private LocalDate dateOfBirth;
    private String phoneNumber;
}