package com.teamf4.springbootdatamongodb.repository;

import java.util.Optional;

import com.teamf4.springbootdatamongodb.model.Billing;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface BillingRepository extends MongoRepository<Billing, String> {
    @Query("{'menu':?0}")
    Optional<Billing> findByMenu(int menu);
  }
