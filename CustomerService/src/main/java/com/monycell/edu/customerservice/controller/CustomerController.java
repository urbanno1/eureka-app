package com.monycell.edu.customerservice.controller;

import com.monycell.edu.customerservice.model.Account;
import com.monycell.edu.customerservice.service.AccountFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    private AccountFeignClient accounClient;

    @RequestMapping("/customer/{customerId}")
    public ResponseEntity<Account> getAccount(@PathVariable("customerId") String customerId) {
        Account account = accounClient.getAccount(customerId);
        return new ResponseEntity<>(account, HttpStatus.OK);
    }

}
