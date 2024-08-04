package com.services.bank.infrastructure.database.model;

import com.services.bank.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document("Transactions")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class TransactionsModel {
    Double amount;
    String cpfOrCnpjReceiver;
    String cpfOrCnpjSender;
}
