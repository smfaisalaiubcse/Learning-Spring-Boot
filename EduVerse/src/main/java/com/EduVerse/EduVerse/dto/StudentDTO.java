package com.EduVerse.EduVerse.dto;
import com.EduVerse.EduVerse.enums.StudentLevel;
import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDTO {
    private String firstName;
    private String lastName;
    private String fatherName;
    private String motherName;
    private String phoneNumber;
    private String address;
    private String bloodGroup;
    private LocalDate dateOfBirth;
    private StudentLevel level;
}
