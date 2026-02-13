package com.paymentslab.paymentsapi.payments.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CreatePaymentIntentRequest(
        @Min(1) long amount,
        @NotBlank @Size(min = 3, max = 3) String currency
) {}
