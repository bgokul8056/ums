package com.example.ums.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ums.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
