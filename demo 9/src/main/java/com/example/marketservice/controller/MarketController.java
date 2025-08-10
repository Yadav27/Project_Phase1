package com.example.marketservice.controller;

import com.example.marketservice.model.Market;
import com.example.marketservice.repository.MarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/market")
public class MarketController {

    @Autowired
    private MarketRepository marketRepository;

    @PostMapping("/place")
    public Market placeMarketOrder(@RequestBody Market marketOrder) {
        marketOrder.setOrderStatus("ACCEPTED");
        return marketRepository.save(marketOrder);
    }
}
