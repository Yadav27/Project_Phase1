package com.example.marketservice.repository;

import com.example.marketservice.model.Market;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MarketRepository extends MongoRepository<Market, String> {
}
