package com.services.bank.orchestrator;

import com.services.bank.infrastructure.database.model.UserModel;
import com.services.bank.infrastructure.database.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class UserOrchestratorImpl implements UserOrchestrator {

    private final UserRepository repository;

    @Override
    public UserModel create() {
        return null;
    }
}
