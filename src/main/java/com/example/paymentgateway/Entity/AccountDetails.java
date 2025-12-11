package com.example.paymentgateway.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
@Table(name = "account_details")
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class AccountDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_details_id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @CreationTimestamp
    private LocalDateTime accountcreatedateandtime;
    private String accountNumber;
    private String accountType;
    private String ifscCode;
    private String branchName;
    private String branchCode;
    private Double balance;
    private String accountStatus;

}