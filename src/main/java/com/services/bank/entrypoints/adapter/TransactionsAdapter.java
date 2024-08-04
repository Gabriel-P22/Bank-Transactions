package com.services.bank.entrypoints.adapter;

import com.services.bank.entrypoints.controller.transactions.dto.TransactionsRequest;
import com.services.bank.infrastructure.database.model.TransactionsModel;
import com.services.bank.usecase.transactions.dto.TransactionsDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TransactionsAdapter {
    TransactionsAdapter INSTANCE = Mappers.getMapper(TransactionsAdapter.class);
    TransactionsDto convert(TransactionsRequest dto);
    TransactionsModel convertToModel(TransactionsDto dto);
}
