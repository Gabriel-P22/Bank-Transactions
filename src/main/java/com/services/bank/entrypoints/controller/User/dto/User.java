package com.services.bank.entrypoints.controller.User.dto;

import com.services.bank.enums.UserType;

public abstract class User {
    String name;
    String email;
    String password;
    UserType type;
}
