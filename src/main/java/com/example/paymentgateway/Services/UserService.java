package com.example.paymentgateway.Services;

import com.example.paymentgateway.dto.responseDto;
import com.example.paymentgateway.dto.UserDto;

public interface UserService {
    responseDto registerUser(UserDto userDto);
}
