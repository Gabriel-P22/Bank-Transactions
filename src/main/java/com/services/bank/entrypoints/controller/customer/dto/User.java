package com.services.bank.entrypoints.controller.customer.dto;

import com.services.bank.enums.UserType;

public abstract class User {
    String name;
    String email;
    String password;
    UserType type;
}
