package com.example.ums.repository;

import com.example.ums.entity.Course;
import com.example.ums.entity.Student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class CourseRepository {

    private JdbcTemplate jdbcTemplate;

    public CourseRepository(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Course> getAll() {
        return this.jdbcTemplate.query("SELECT id, name FROM course", new BeanPropertyRowMapper<>(Course.class));
    }

    public Course getCourse(int id) {
        return this.jdbcTemplate.queryForObject("SELECT id, name FROM course WHERE id = ?", new Object[]{id}, new BeanPropertyRowMapper<>(Course.class));
    }

    public void save(Course course) {
        this.jdbcTemplate.update("INSERT INTO course (id, name) VALUES (?, ?)", course.getId(), course.getName());
    }

    public void update(Course course) {
        this.jdbcTemplate.update("UPDATE course SET name = ? WHERE id = ?", course.getName(), course.getId());
    }

    public void delete(int id) {
        this.jdbcTemplate.update("DELETE FROM course WHERE id = ?", id);
    }
}
