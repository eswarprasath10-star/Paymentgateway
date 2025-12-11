package com.example.paymentgateway.Services.Impl;

import com.example.paymentgateway.Entity.AccountDetails;
import com.example.paymentgateway.Entity.User;
import com.example.paymentgateway.Enum.ResponseCodeandMessage;
import com.example.paymentgateway.Services.UserService;
import com.example.paymentgateway.Utility.customErrorException;
import com.example.paymentgateway.dto.AccountDTO;
import com.example.paymentgateway.dto.responseDto;
import com.example.paymentgateway.dto.UserDto;
import com.example.paymentgateway.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Component
@Service
public class UserServiceImpl implements UserService {

private final UserRepository userRepository;

    public  UserServiceImpl(UserRepository userRepository)
    {
        this.userRepository=userRepository;
    }
    @Autowired
    @Qualifier("customerPasswordEncoder")
    private PasswordEncoder passwordEncoder;

    @Override
    public responseDto registerUser(UserDto userDto) {

        var alreadyExit = userRepository.findOneByEmailAddress(userDto.getEmailAddress());
        if (alreadyExit == null) {
            var userDetails = User.builder().userName(userDto.getUserName()).mobileNumber(userDto.getMobileNumber())
                    .emailAddress(userDto.getEmailAddress()).password(passwordEncoder.encode(userDto.getPassword()))
                    .customerNumber(userDto.getCustomerNumber()).transactionpassword(passwordEncoder.encode(userDto.getTransactionpassword())).build();
            List<AccountDetails> accountDetailsList=new ArrayList<>();
            for(AccountDTO accountDetails:userDto.getAccounts())
            {
                accountDetailsList.add(AccountDetails.builder().accountNumber(accountDetails.getAccountNumber())
                                .accountStatus(accountDetails.getAccountStatus())
                                .accountType(accountDetails.getAccountType())
                                .ifscCode(accountDetails.getIfscCode())
                                .balance(accountDetails.getBalance())
                                .branchCode(accountDetails.getBranchCode())
                                .branchName(accountDetails.getBranchName())
                        .build());
            }
            userDetails.setAccountDetails(accountDetailsList);
            userRepository.save(userDetails);
        }
        else{
                throw new customErrorException(ResponseCodeandMessage.EMAILALREADYEXIT.getCode(), ResponseCodeandMessage.EMAILALREADYEXIT.getMessage());
            }
            return responseDto.builder().message("User Created Successfully").code("0000").build();
        }
    }