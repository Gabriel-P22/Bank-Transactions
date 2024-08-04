package com.services.bank.orchestrator;

import com.services.bank.infrastructure.database.model.UserModel;

public interface UserOrchestrator {
    void create(UserModel model) throws Exception;
}
