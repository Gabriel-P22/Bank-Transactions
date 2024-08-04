package com.services.bank.entrypoints.controller.customer;

import com.services.bank.entrypoints.controller.customer.dto.CreateRequest;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserImpl implements User {

    @Override
    @PostMapping("/v1/create")
    public ResponseEntity<Void> create(@Valid @RequestBody CreateRequest dto) {
        return null;
    }
}
