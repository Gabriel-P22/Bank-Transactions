package com.services.bank.entrypoints.controller.transactions.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TransactionsRequest {
    @NotNull(message = "Invalid amount")
    Double amount;

    @NotNull(message = "Invalid amount")
    @NotEmpty(message = "Invalid amount")
    String cpfOrCnpjReceiver;

    @NotNull(message = "Invalid amount")
    @NotEmpty(message = "Invalid amount")
    String cpfOrCnpjSender;
}
