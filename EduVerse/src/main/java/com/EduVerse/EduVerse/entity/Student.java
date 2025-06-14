package com.EduVerse.EduVerse.entity;

import com.EduVerse.EduVerse.enums.StudentLevel;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student extends Profile {

    @Enumerated(EnumType.STRING)
    private StudentLevel level;

    public StudentLevel getLevel() {
        return level;
    }

    public void setLevel(StudentLevel level) {
        this.level = level;
    }
}