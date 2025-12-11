package com.example.paymentgateway.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
    @Table(name = "users")
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

         private String userName;
         private String password;
         private String  customerNumber;
         private String emailAddress;
         private String mobileNumber;
         private String transactionpassword;
        @CreationTimestamp
        private LocalDateTime userCreateDateTime;
        @OneToMany(cascade = CascadeType.ALL)
        @JoinColumn(name="user_id")
        private List<AccountDetails> accountDetails;

    }

