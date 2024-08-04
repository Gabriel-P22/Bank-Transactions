package com.services.bank.usecase.customer;

import com.services.bank.entrypoints.adapter.UserAdapter;
import com.services.bank.orchestrator.UserOrchestrator;
import com.services.bank.usecase.dto.UserDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserUseCaseImpl implements UserUseCase {

    private final UserOrchestrator orchestrator;

    @Override
    public void create(UserDto dto) throws Exception {
        orchestrator.create(UserAdapter.INSTANCE.convertToModel(dto));
    }
}
