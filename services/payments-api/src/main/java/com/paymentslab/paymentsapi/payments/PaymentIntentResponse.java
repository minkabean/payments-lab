package com.paymentslab.paymentsapi.payments;


import java.time.Instant;
import java.util.UUID;

public record PaymentIntentResponse(
        UUID id,
        long amount,
        String currency,
        String status,
        Instant createdAt,
        Instant updatedAt
) {}
