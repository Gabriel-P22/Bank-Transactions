package com.services.bank.usecase.transactions.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TransactionsDto {
    Double amount;
    String cpfOrCnpjReceiver;
    String cpfOrCnpjSender;
}
