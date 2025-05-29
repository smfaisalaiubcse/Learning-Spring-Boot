package com.Management.TicketBooking.dto.response;

public class RegistrationResponse {
    private String message;
    private int userId;

    public RegistrationResponse() {}

    public RegistrationResponse(String message, int userId) {
        this.message = message;
        this.userId = userId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
