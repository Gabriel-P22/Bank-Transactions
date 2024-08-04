package com.services.bank.usecase.transactions;

import com.services.bank.entrypoints.adapter.TransactionsAdapter;
import com.services.bank.orchestrator.transactionsOrchestrator.TransactionsOrchestrator;
import com.services.bank.usecase.transactions.dto.TransactionsDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TransactionsUseCaseImpl implements TransactionsUseCase {

    private final TransactionsOrchestrator orchestrator;

    @Override
    public void transfer(TransactionsDto dto) throws Exception {
        orchestrator.transfer(TransactionsAdapter.INSTANCE.convertToModel(dto));
    }
}
