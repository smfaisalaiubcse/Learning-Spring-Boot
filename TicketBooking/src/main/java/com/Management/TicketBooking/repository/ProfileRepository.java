package com.Management.TicketBooking.repository;

import com.Management.TicketBooking.entity.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProfileRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(Profile profile) {
        String sql = "INSERT INTO profile (user_id, first_name, last_name, address, phone_number, date_of_birth) " +
                "VALUES (?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql,
                profile.getUserId(),
                profile.getFirstName(),
                profile.getLastName(),
                profile.getAddress(),
                profile.getPhoneNumber(),
                profile.getDateOfBirth());
    }
}
