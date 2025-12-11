package com.example.paymentgateway.Controller;

import com.example.paymentgateway.Services.UserService;
import com.example.paymentgateway.dto.responseDto;
import com.example.paymentgateway.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/User")
public class userRegistrationController {
    @Autowired
   private  UserService userService;
    @PostMapping("/register")
    public  responseDto  register(@RequestBody UserDto userDto)
    {
        return userService.registerUser(userDto);
    }
}
