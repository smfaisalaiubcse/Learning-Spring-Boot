package com.StudentManagement.StudentManagement.repository;

import com.StudentManagement.StudentManagement.entity.Student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class StudentRepository {
    private static final String GET_ALL = "SELECT id, email FROM students";
    private static final String GET_ONE = "SELECT id, email FROM students WHERE id = ?";
    private static final String INSERT_ONE = "INSERT INTO students (id, email) VALUES (?, ?)";
    private static final String UPDATE_ONE = "UPDATE students SET email = ? WHERE id = ?";
    private static final String DELETE_ONE = "DELETE FROM students WHERE id = ?";

    private JdbcTemplate jdbcTemplate;

    public StudentRepository(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Student> getAll() {
        return jdbcTemplate.query(GET_ALL, new BeanPropertyRowMapper<>(Student.class));
    }

    public Student get(String id) {
        return jdbcTemplate.queryForObject(GET_ONE, new Object[] {id}, new BeanPropertyRowMapper<>(Student.class));
    }

    public void save(Student student) {
        jdbcTemplate.update(INSERT_ONE, student.getId(), student.getEmail());
    }

    public void update(Student student) {
        jdbcTemplate.update(UPDATE_ONE, student.getEmail(), student.getId());
    }

    public void delete(String id) {
        jdbcTemplate.update(DELETE_ONE, id);
    }
}
