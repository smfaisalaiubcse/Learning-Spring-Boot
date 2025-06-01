package com.example.ums.repository;

import com.example.ums.entity.Course;
import com.example.ums.entity.Student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class StudentRepository {

    private JdbcTemplate jdbcTemplate;

    public StudentRepository(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Student> getAll() {
        return this.jdbcTemplate.query("SELECT id, email FROM students", new BeanPropertyRowMapper<>(Student.class));
    }

    public Student getStudent(int id) {
        return this.jdbcTemplate.queryForObject("SELECT id, email FROM students WHERE id = ?", new Object[]{id}, new BeanPropertyRowMapper<>(Student.class));
    }

    public void save(Student student) {
        this.jdbcTemplate.update("INSERT INTO students (id, email) VALUES (?, ?)", student.getId(), student.getEmail());
    }

    public void update(Student student) {
        this.jdbcTemplate.update("UPDATE students SET email = ? WHERE id = ?", student.getEmail(), student.getId());
    }

    public void delete(int id) {
        this.jdbcTemplate.update("DELETE FROM students WHERE id = ?", id);
    }

    public Student getStudentWithCourse(int id) {
        String sql = """
                    SELECT s.id AS student_id, s.email, 
                           c.id AS course_id, c.name AS course_name
                    FROM students s
                    LEFT JOIN course c ON s.id = c.student_id
                    WHERE s.id = ?
                """;

        return jdbcTemplate.queryForObject(sql, new Object[]{id}, (rs, rowNum) -> {
            Student student = new Student();
            student.setId(rs.getInt("student_id"));
            student.setEmail(rs.getString("email"));

            Course course = new Course();
            course.setId(rs.getInt("course_id"));
            course.setName(rs.getString("course_name"));

            student.setCourse(course);
            return student;
        });
    }
}
