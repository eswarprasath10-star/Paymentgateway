package com.example.paymentgateway.Exception;

import java.util.Map;

public record ErrorExceptionDto (String Errorcode, String ErrorMessage, Map<String,Object> Response){
}
