package com.services.bank.entrypoints.adapter;

import com.services.bank.entrypoints.controller.User.dto.CreateRequest;
import com.services.bank.infrastructure.database.model.UserModel;
import com.services.bank.usecase.customer.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserAdapter {
    UserAdapter INSTANCE = Mappers.getMapper(UserAdapter.class);
    UserModel convertToModel(UserDto dto);
    UserDto convert(CreateRequest dto);
}
