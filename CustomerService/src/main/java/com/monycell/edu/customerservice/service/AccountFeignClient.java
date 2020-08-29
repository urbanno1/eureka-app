package com.monycell.edu.customerservice.service;

import com.monycell.edu.customerservice.model.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("AccountService")
public interface AccountFeignClient {

    @RequestMapping("/account/{customerId}")
    public Account getAccount(@PathVariable("customerId") String customerId);
}
