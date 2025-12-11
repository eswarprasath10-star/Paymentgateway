package com.example.paymentgateway.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class responseDto {
    @JsonProperty("Message")
    private String message;
    @JsonProperty("Code")
    private String code;
}
