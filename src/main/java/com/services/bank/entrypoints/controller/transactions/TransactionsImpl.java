package com.services.bank.entrypoints.controller.transactions;

import com.services.bank.entrypoints.controller.transactions.dto.TransactionsRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transactions")
@AllArgsConstructor
public class TransactionsImpl implements Transactions{

    @Override
    @PostMapping("/v1/transfer")
    public ResponseEntity<Void> transfer(TransactionsRequest dto) {
        return ResponseEntity.accepted().build();
    }
}
