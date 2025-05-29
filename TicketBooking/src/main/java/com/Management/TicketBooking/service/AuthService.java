package com.Management.TicketBooking.service;

import com.Management.TicketBooking.entity.User;
import com.Management.TicketBooking.entity.Profile;
import com.Management.TicketBooking.repository.UserRepository;
import com.Management.TicketBooking.repository.ProfileRepository;
import com.Management.TicketBooking.exception.CustomException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProfileRepository profileRepository;

    @Transactional
    public void register(User user, Profile profile) {
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new CustomException("Email already exists.");
        }

        int userId = userRepository.save(user);
        profile.setUserId(userId);
        profileRepository.save(profile);
    }
}

