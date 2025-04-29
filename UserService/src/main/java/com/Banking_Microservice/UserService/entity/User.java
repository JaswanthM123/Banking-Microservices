package com.Banking_Microservice.UserService.entity;


import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false, unique = true)
    private Long customerId;  // should exist in Customer Service

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password; // encrypted password

    private LocalDateTime createdAt = LocalDateTime.now();
}

