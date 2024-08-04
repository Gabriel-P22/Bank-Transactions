package com.services.bank.usecase.customer;


import com.services.bank.entrypoints.controller.customer.dto.CreateRequest;

public interface CustomerUseCase {
    void create(CreateRequest dto);
}
