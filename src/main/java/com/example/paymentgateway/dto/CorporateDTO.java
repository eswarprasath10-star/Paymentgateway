package com.example.paymentgateway.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CorporateDTO {
    private String corporateId;
    private String corporateName;
    private String role;
    private String approverCount;
    private String eligiableMaxAmount;
    private String eligiableMinAmount;
}
