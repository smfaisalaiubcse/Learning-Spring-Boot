package com.Management.TicketBooking.controller;

import com.Management.TicketBooking.dto.request.RegistrationRequest;
import com.Management.TicketBooking.dto.response.RegistrationResponse;
import com.Management.TicketBooking.entity.User;
import com.Management.TicketBooking.entity.Profile;
import com.Management.TicketBooking.service.AuthService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<RegistrationResponse> register(@RequestBody RegistrationRequest request) {
        User user = new User(0, request.getEmail(), request.getPassword(), request.getRole());
        Profile profile = new Profile(
                0, 0, request.getFirstName(), request.getLastName(),
                request.getAddress(), request.getPhoneNumber(), request.getDateOfBirth()
        );

        int userId = authService.register(user, profile);
        return ResponseEntity.ok(new RegistrationResponse("User registered successfully.", userId));
    }
}
