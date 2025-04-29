package com.Banking_Microservice.UserService.repository;



import com.Banking_Microservice.UserService.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
