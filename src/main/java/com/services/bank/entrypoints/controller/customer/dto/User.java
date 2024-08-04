package com.services.bank.entrypoints.controller.customer.dto;

import com.services.bank.enums.CustomerType;

public abstract class User {
    String name;
    String email;
    String password;
    CustomerType type;
}
