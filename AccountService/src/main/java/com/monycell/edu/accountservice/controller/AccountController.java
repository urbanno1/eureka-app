package com.monycell.edu.accountservice.controller;

import com.monycell.edu.accountservice.model.Account;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @RequestMapping("/account/{customerId}")
    public ResponseEntity<Account> getAccount(@PathVariable("customerId") String customerId) {
        Account account = new Account(customerId, 35000.00);
        return new ResponseEntity<>(account, HttpStatus.OK);
    }
}
