package com.services.bank.entrypoints.controller.transactions;

import com.services.bank.entrypoints.controller.transactions.dto.TransactionsRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public interface Transactions {
    ResponseEntity<Void> transfer(@Valid @RequestBody TransactionsRequest dto);
}
