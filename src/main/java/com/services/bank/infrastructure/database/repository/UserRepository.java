package com.services.bank.infrastructure.database.repository;

import com.services.bank.infrastructure.database.model.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserModel, String> {
}
