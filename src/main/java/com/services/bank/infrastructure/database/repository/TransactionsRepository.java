package com.services.bank.infrastructure.database.repository;

import com.services.bank.infrastructure.database.model.TransactionsModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionsRepository extends MongoRepository<TransactionsModel, String> {
}
