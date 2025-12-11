package com.example.paymentgateway.repository;

import com.example.paymentgateway.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findOneByEmailAddress(String email);
}
