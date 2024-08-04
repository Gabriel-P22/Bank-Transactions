package com.services.bank.entrypoints.controller.User.dto;

import com.services.bank.constants.ApiConstants;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CreateRequest {

    @NotNull(message = "name cannot be empty")
    @NotEmpty(message = "name cannot be empty")
    String name;


    @NotNull(message = "CPF OR CNPJ cannot be empty")
    @NotEmpty(message = "CPF OR CNPJ be empty")
    @Pattern(
            regexp = ApiConstants.CPF_OR_CNPJ_REGEX,
            message = "Invalid CPF or CPNJ"
    )
    String cpfOrCnpj;

    @NotNull(message = "EMAIL cannot be empty")
    @NotEmpty(message = "EMAIL cannot be empty")
    String email;

    @NotNull(message = "PASSWORD cannot be empty")
    @NotEmpty(message = "PASSWORD cannot be empty")
    String password;

    @NotNull(message = "AMOUNT cannot be empty")
    Double amount;
}
