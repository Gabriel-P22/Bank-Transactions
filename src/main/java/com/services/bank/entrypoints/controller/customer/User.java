package com.services.bank.entrypoints.controller.customer;

import com.services.bank.entrypoints.controller.customer.dto.CreateRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public interface User {
    public ResponseEntity<Void> create(@RequestBody CreateRequest dto) throws Exception;
}
