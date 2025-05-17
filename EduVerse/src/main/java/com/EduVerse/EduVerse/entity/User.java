package com.EduVerse.EduVerse.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "users") // avoids SQL reserved word conflict
public class User {

    @Id
    private String id;

    @Column(nullable = false, unique = true)
    private String email; // or phone (multi-field login can be added later)

    @Column(nullable = false)
    private String password;

    @OneToOne
    @JoinColumn(name = "profile_id", referencedColumnName = "id")
    private Profile profile;
}