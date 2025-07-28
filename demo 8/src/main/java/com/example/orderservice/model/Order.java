package com.example.orderservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orders")
public class Order {
    @Id
    private String id;
    private String userId;
    private String stockSymbol;
    private int quantity;
    private String status; // PENDING, COMPLETED

    public Order() {}

    public Order(String userId, String stockSymbol, int quantity, String status) {
        this.userId = userId;
        this.stockSymbol = stockSymbol;
        this.quantity = quantity;
        this.status = status;
    }

    // Getters and Setters
    public String getId() { return id; }
    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }
    public String getStockSymbol() { return stockSymbol; }
    public void setStockSymbol(String stockSymbol) { this.stockSymbol = stockSymbol; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
