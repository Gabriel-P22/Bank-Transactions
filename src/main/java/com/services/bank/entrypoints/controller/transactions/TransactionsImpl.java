package com.services.bank.entrypoints.controller.transactions;

import com.services.bank.entrypoints.adapter.TransactionsAdapter;
import com.services.bank.entrypoints.controller.transactions.dto.TransactionsRequest;
import com.services.bank.usecase.transactions.TransactionsUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transactions")
@AllArgsConstructor
public class TransactionsImpl implements Transactions{

    private final TransactionsUseCase useCase;

    @Override
    @PostMapping("/v1/transfer")
    public ResponseEntity<Void> transfer(TransactionsRequest dto) throws Exception {
        useCase.transfer(TransactionsAdapter.INSTANCE.convert(dto));
        return ResponseEntity.accepted().build();
    }
}
