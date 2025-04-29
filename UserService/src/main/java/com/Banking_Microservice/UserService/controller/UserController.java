package com.Banking_Microservice.UserService.controller;


import com.Banking_Microservice.UserService.dto.RegistrationRequest;
import com.Banking_Microservice.UserService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String registerUser(@RequestBody RegistrationRequest request) {
        return userService.registerUser(request);
    }
}
