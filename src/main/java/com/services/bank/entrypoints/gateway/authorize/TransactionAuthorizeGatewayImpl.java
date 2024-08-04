package com.services.bank.entrypoints.gateway.authorize;

import com.services.bank.constants.ApiConstants;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class TransactionAuthorizeGatewayImpl implements TransactionAuthorizeGateway {

    private final WebClient webClient;

    @Override
    public boolean authorize() {
        Mono<Boolean> response = this.webClient
                .get()
                .uri(ApiConstants.AUTHORIZE_PATH)
                .header(ApiConstants.HEADER_KEY, ApiConstants.HEADER_VALUE)
                .retrieve()
                .bodyToMono(Boolean.class);

        return Boolean.TRUE.equals(response.block());
    }
}
