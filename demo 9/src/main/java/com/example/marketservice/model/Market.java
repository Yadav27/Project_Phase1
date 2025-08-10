package com.example.marketservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "market_orders")
public class Market {
    @Id
    private String id;
    private String stockSymbol;
    private int quantity;
    private String orderStatus; // ACCEPTED, REJECTED

    public Market() {}

    public Market(String stockSymbol, int quantity, String orderStatus) {
        this.stockSymbol = stockSymbol;
        this.quantity = quantity;
        this.orderStatus = orderStatus;
    }

    // Getters & Setters
    public String getId() { return id; }
    public String getStockSymbol() { return stockSymbol; }
    public void setStockSymbol(String stockSymbol) { this.stockSymbol = stockSymbol; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public String getOrderStatus() { return orderStatus; }
    public void setOrderStatus(String orderStatus) { this.orderStatus = orderStatus; }
}
