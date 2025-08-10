package com.example.accountservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "transactions")
public class AccountTransaction {
    @Id
    private String id;
    private String userId;
    private double amount;
    private String transactionType; // DEBIT, CREDIT
    private String status; // SUCCESS, FAILED

    public AccountTransaction() {}

    public AccountTransaction(String userId, double amount, String transactionType, String status) {
        this.userId = userId;
        this.amount = amount;
        this.transactionType = transactionType;
        this.status = status;
    }

    // Getters & Setters
    public String getId() { return id; }
    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }
    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
    public String getTransactionType() { return transactionType; }
    public void setTransactionType(String transactionType) { this.transactionType = transactionType; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
