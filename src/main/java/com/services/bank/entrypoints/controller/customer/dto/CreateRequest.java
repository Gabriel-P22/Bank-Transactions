package com.services.bank.entrypoints.controller.customer.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CreateRequest {
    String name;
    String cpfOrCnpj;
    String email;
    String password;
}
