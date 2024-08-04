package com.services.bank.usecase.transactions;

import com.services.bank.entrypoints.adapter.TransactionsAdapter;
import com.services.bank.entrypoints.gateway.authorize.TransactionAuthorizeGatewayImpl;
import com.services.bank.orchestrator.transactionsOrchestrator.TransactionsOrchestrator;
import com.services.bank.usecase.transactions.dto.TransactionsDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TransactionsUseCaseImpl implements TransactionsUseCase {

    private final TransactionsOrchestrator orchestrator;

    private final TransactionAuthorizeGatewayImpl gateway;

    @Override
    public void transfer(TransactionsDto dto) throws Exception {
        if (!gateway.authorize()) {
            throw new Exception();
        }
        orchestrator.transfer(TransactionsAdapter.INSTANCE.convertToModel(dto));
    }
}
