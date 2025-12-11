package com.example.paymentgateway.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDTO {
    private String accountNumber;
    private String accountType;
    private String ifscCode;
    private String branchName;
    private String branchCode;
    private Double balance;
    private String accountStatus;
}
