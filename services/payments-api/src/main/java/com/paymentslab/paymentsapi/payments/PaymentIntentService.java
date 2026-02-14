package com.paymentslab.paymentsapi.payments;

import org.springframework.stereotype.Service;

import com.paymentslab.paymentsapi.payments.PaymentIntentEntity;
import com.paymentslab.paymentsapi.payments.PaymentIntentRepository;
import com.paymentslab.paymentsapi.payments.PaymentIntentResponse;

import java.time.Instant;
import java.util.UUID;

@Service
public class PaymentIntentService {

    private final PaymentIntentRepository repository;

    public PaymentIntentService(PaymentIntentRepository repository) {
        this.repository = repository;
    }

    public PaymentIntentEntity createTestIntent() {
        var intent = new PaymentIntentEntity();
        intent.setId(UUID.randomUUID());
        intent.setAmount(1000);
        intent.setCurrency("USD");
        intent.setStatus("CREATED");
        intent.setCreatedAt(Instant.now());
        intent.setUpdatedAt(Instant.now());
        return repository.save(intent);
    }

    public PaymentIntentResponse create(long amount, String currency){
        var intent = new PaymentIntentEntity();
        intent.setId(UUID.randomUUID());
        intent.setAmount(amount);
        intent.setCurrency(currency);
        intent.setStatus("CREATED");
        intent.setCreatedAt(Instant.now());
        intent.setUpdatedAt(Instant.now());
        var savedIntent = repository.save(intent);
        return new PaymentIntentResponse(
                savedIntent.getId(),
                savedIntent.getAmount(),
                savedIntent.getCurrency(),
                savedIntent.getStatus(),
                savedIntent.getCreatedAt(),
                savedIntent.getUpdatedAt()
        );
    }
}
