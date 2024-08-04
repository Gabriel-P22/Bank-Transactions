package com.services.bank.usecase.customer.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class UserDto {
    String name;
    String cpfOrCnpj;
    String email;
    String password;
    Double amount;
}
