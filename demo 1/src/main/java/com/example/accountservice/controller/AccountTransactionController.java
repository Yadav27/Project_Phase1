package com.example.accountservice.controller;

import com.example.accountservice.model.AccountTransaction;
import com.example.accountservice.repository.AccountTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountTransactionController {

    @Autowired
    private AccountTransactionRepository transactionRepository;

    @PostMapping("/debit")
    public AccountTransaction debitAmount(@RequestBody AccountTransaction transaction) {
        transaction.setTransactionType("DEBIT");
        transaction.setStatus("SUCCESS");
        return transactionRepository.save(transaction);
    }
}
