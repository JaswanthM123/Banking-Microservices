package com.Banking_Microservice.UserService.service;



import com.Banking_Microservice.UserService.dto.RegistrationRequest;
import com.Banking_Microservice.UserService.entity.User;
import com.Banking_Microservice.UserService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public String registerUser(RegistrationRequest request) {
        // 1. Check if username already exists
        if (userRepository.findByUsername(request.getUsername()).isPresent()) {
            return "Username already exists!";
        }

        // 2. TODO: Check if CustomerId exists in Customer Service (future integration)

        // 3. Save the user
        User user = new User();
        user.setCustomerId(request.getCustomerId());
        user.setUsername(request.getUsername());
        user.setPassword(passwordEncoder.encode(request.getPassword())); // encrypt password

        userRepository.save(user);
        return "User registered successfully!";
    }
}

