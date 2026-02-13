package com.paymentslab.paymentsapi.payments.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paymentslab.paymentsapi.payments.model.PaymentIntentEntity;
import com.paymentslab.paymentsapi.payments.service.PaymentIntentService;

@RestController
public class PaymentIntentDevController {

    private final PaymentIntentService service;

    public PaymentIntentDevController(PaymentIntentService service) {
        this.service = service;
    }

    @PostMapping("/dev/create-test-intent")
    public PaymentIntentEntity createTestIntent() {
        return service.createTestIntent();
    }
}
