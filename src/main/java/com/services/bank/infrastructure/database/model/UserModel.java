package com.services.bank.infrastructure.database.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("User")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class UserModel {
    String name;
    String cpfOrCnpj;
    String email;
    String password;
}
