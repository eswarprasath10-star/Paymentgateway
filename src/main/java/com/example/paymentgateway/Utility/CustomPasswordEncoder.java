package com.example.paymentgateway.Utility;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;

@Configuration
public class CustomPasswordEncoder{
    @Bean(name = "customerPasswordEncoder")
    public PasswordEncoder customerPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
