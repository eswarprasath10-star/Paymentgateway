package com.example.paymentgateway.Enum;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter

public enum ResponseCodeandMessage {
    SUCCESS("0000","SUCCESS"),
    EMAILALREADYEXIT("0080","email address already exit");
    private String code;
    private String message;
    ResponseCodeandMessage(String code,String message)
    {
        this.code=code;
        this.message=message;
    }

}