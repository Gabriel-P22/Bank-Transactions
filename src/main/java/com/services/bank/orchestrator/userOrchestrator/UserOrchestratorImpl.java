package com.services.bank.orchestrator.userOrchestrator;

import com.services.bank.constants.ApiConstants;
import com.services.bank.enums.UserType;
import com.services.bank.helpers.CpfValidator;
import com.services.bank.infrastructure.database.model.UserModel;
import com.services.bank.infrastructure.database.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component
@AllArgsConstructor
public class UserOrchestratorImpl implements UserOrchestrator {

    private final UserRepository repository;

    private final MongoTemplate template;

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

    @Override
    public List<UserModel> findByCpfOrCnpj(String cpfOrCnpj) throws Exception {
        try {
            return template.find(createQuery("cpfOrCnpj", cpfOrCnpj), UserModel.class);
        } catch (Exception e) {
            throw new Exception();
        }
    }

    @Override
    public void update(UserModel model) throws Exception {
        try {
            repository.save(model);
        } catch (Exception e) {
            throw new Exception();
        }
    }

    private Query createQuery(String fieldName, String value) {
        Query query = new Query();

        query.addCriteria(Criteria.where(fieldName).is(value));

        return query;
    }
}
