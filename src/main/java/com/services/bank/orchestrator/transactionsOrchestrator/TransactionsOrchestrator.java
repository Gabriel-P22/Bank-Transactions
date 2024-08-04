package com.services.bank.orchestrator.transactionsOrchestrator;

import com.services.bank.infrastructure.database.model.TransactionsModel;

public interface TransactionsOrchestrator {
    void transfer(TransactionsModel model) throws Exception;
}
