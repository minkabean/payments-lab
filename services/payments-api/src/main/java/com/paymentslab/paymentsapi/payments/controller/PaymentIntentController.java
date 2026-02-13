package com.paymentslab.paymentsapi.payments.controller;

import com.paymentslab.paymentsapi.payments.dto.CreatePaymentIntentRequest;
import com.paymentslab.paymentsapi.payments.dto.PaymentIntentResponse;
import com.paymentslab.paymentsapi.payments.service.PaymentIntentService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/payment-intents")
public class PaymentIntentController {

    private final PaymentIntentService service;

    public PaymentIntentController(PaymentIntentService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PaymentIntentResponse create(@Valid @RequestBody CreatePaymentIntentRequest request) {
        return service.create(request.amount(), request.currency().toUpperCase());
    }
}
