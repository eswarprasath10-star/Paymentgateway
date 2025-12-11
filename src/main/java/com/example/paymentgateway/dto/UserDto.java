package com.example.paymentgateway.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private String userName;
    private String password;
    private String  customerNumber;
    private String emailAddress;
    private String mobileNumber;
    private String transactionpassword;
    private List<AccountDTO> accounts;
    private List<CorporateDTO> corporates;
}
