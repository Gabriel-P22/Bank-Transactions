package com.services.bank.usecase.transactions;

import com.services.bank.usecase.transactions.dto.TransactionsDto;

public interface TransactionsUseCase {
    void transfer(TransactionsDto dto) throws Exception;
}
