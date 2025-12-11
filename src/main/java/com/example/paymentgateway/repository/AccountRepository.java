package com.example.paymentgateway.repository;

import com.example.paymentgateway.Entity.AccountDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<AccountDetails, Long> {}
