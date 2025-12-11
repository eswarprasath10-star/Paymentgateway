package com.example.paymentgateway.Exception;

import com.example.paymentgateway.Utility.customErrorException;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
@Configuration
public class GlobalExceptionHandler {

    @ExceptionHandler(customErrorException.class)
    public ResponseEntity<ErrorExceptionDto> handleCustomError(customErrorException ex) {
        Map<String,Object> response=new HashMap<>();
        response.put("response",ex.getErrorMessage());
        var errorResponse=new ErrorExceptionDto(ex.getErrorcode(),"FAILURE",response);
        return new ResponseEntity<>(errorResponse,HttpStatus.UNAUTHORIZED);
    }
}
