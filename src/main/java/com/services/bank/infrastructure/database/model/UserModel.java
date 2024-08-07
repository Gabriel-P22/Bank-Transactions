package com.services.bank.infrastructure.database.model;

import com.services.bank.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document("User")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class UserModel {
    @Id
    String id;

    String name;
    String cpfOrCnpj;
    String email;
    String password;
    UserType type;
    Double amount;
}
