package com.services.bank.orchestrator;

import com.services.bank.infrastructure.database.model.UserModel;

public interface UserOrchestrator {
    UserModel create();
}
