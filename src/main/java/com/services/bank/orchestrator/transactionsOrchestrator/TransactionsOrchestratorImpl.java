package com.services.bank.orchestrator.transactionsOrchestrator;

import com.services.bank.enums.UserType;
import com.services.bank.infrastructure.database.model.TransactionsModel;
import com.services.bank.infrastructure.database.model.UserModel;
import com.services.bank.infrastructure.database.repository.TransactionsRepository;
import com.services.bank.infrastructure.database.repository.UserRepository;
import com.services.bank.orchestrator.userOrchestrator.UserOrchestrator;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component
@AllArgsConstructor
public class TransactionsOrchestratorImpl implements TransactionsOrchestrator {

    private final TransactionsRepository repository;

    private final UserOrchestrator userOrchestrator;

    @Override
    public void transfer(TransactionsModel model) throws Exception {

        try {
            List<UserModel> sender = userOrchestrator.findByCpfOrCnpj(model.getCpfOrCnpjSender());
            List<UserModel> receiver = userOrchestrator.findByCpfOrCnpj(model.getCpfOrCnpjReceiver());

            if (sender.isEmpty() || receiver.isEmpty()) {
                throw new Exception();
            }

            if (sender.get(0).getType() == UserType.store) {
                throw new Exception();
            }

            if (sender.get(0).getAmount() < model.getAmount()) {
                throw new Exception();
            }

            Double amount = model.getAmount();

            Double senderNewAmount = sender.get(0).getAmount() - amount;
            Double receiverNewAmount = receiver.get(0).getAmount() + amount;

            sender.get(0).setAmount(senderNewAmount);
            receiver.get(0).setAmount(receiverNewAmount);

            userOrchestrator.update(sender.get(0));
            userOrchestrator.update(receiver.get(0));

            repository.save(model);
        } catch (Exception e) {
            throw new Exception();
        }

    }
}
