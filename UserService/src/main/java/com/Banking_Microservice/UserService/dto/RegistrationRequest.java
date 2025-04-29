package com.Banking_Microservice.UserService.dto;



import lombok.Data;

@Data
public class RegistrationRequest {
    private Long customerId; // customer must enter the correct one
    private String username;
    private String password;
}

