package com.example.paymentgateway.Utility;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class customErrorException extends RuntimeException{
    @JsonProperty("ErrorCode")
    private String errorcode;
    @JsonProperty("ErrorMessage")
    private String errorMessage;

    public  customErrorException(String code,String message)
    {
        super(message);
        this.errorcode=code;
        this.errorMessage=message;
    }

}
