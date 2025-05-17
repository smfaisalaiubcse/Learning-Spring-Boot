package com.EduVerse.EduVerse.repository;

import com.EduVerse.EduVerse.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, String> {
}