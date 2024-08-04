package com.services.bank.entrypoints.controller.customer;

import com.services.bank.entrypoints.controller.customer.dto.CreateRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserImpl implements User {
    @Override
    public ResponseEntity<Void> create(CreateRequest dto) {
        return null;
    }
}
