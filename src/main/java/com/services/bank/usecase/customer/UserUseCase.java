package com.services.bank.usecase.customer;

import com.services.bank.usecase.customer.dto.UserDto;

public interface UserUseCase {
    void create(UserDto dto) throws Exception;
}
