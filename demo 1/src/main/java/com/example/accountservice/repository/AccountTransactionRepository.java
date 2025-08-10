package com.example.accountservice.repository;

import com.example.accountservice.model.AccountTransaction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountTransactionRepository extends MongoRepository<AccountTransaction, String> {
}
