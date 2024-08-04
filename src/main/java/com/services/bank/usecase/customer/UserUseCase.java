package com.services.bank.usecase.customer;

import com.services.bank.usecase.dto.UserDto;

public interface UserUseCase {
    void create(UserDto dto) throws Exception;
}
