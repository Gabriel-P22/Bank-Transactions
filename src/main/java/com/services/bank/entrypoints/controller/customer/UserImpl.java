package com.services.bank.entrypoints.controller.customer;

import com.services.bank.entrypoints.adapter.UserAdapter;
import com.services.bank.entrypoints.controller.customer.dto.CreateRequest;
import com.services.bank.infrastructure.database.repository.UserRepository;
import com.services.bank.usecase.customer.UserUseCase;
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

    private final UserUseCase useCase;

    @Override
    @PostMapping("/v1/create")
    public ResponseEntity<Void> create(@Valid @RequestBody CreateRequest dto) throws Exception {
        useCase.create(UserAdapter.INSTANCE.convert(dto));
        return null;
    }
}
