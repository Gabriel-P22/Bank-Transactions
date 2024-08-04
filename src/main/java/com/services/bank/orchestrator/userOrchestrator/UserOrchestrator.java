package com.services.bank.orchestrator.userOrchestrator;

import com.services.bank.infrastructure.database.model.UserModel;

import java.util.List;

public interface UserOrchestrator {
    void create(UserModel model) throws Exception;

    void update(UserModel model) throws Exception;

    List<UserModel> findByCpfOrCnpj(String cpfOrCnpj) throws Exception;
}
