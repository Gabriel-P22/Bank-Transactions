package com.services.bank.orchestrator;

import com.services.bank.constants.ApiConstants;
import com.services.bank.enums.UserType;
import com.services.bank.helpers.CpfValidator;
import com.services.bank.infrastructure.database.model.UserModel;
import com.services.bank.infrastructure.database.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;

@Repository
@AllArgsConstructor
public class UserOrchestratorImpl implements UserOrchestrator {

    private final UserRepository repository;

    @Override
    public void create(UserModel model) throws Exception {

        List<UserModel> modelList = repository.findAll();

        boolean hasData = false;

        if (!modelList.isEmpty()) {
            hasData = modelList.stream().allMatch(entity -> {
                return Objects.equals(entity.getCpfOrCnpj(), model.getCpfOrCnpj()) &&
                        Objects.equals(entity.getEmail(), model.getEmail());
            });
        }

        boolean isCpf = CpfValidator.isValid(model.getCpfOrCnpj(), ApiConstants.CPF_REGEX);

        try {
            if (hasData) {
                throw new Exception();
            }

            model.setType(isCpf ? UserType.customer : UserType.store);

            repository.save(model);
        } catch (Exception e) {
            throw new Exception();
        }
    }
}
