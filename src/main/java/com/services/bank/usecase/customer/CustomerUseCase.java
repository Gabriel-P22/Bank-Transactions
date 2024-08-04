package com.services.bank.usecase.customer;

import com.services.bank.usecase.dto.UserDto;

public interface CustomerUseCase {
    void create(UserDto dto);
}
