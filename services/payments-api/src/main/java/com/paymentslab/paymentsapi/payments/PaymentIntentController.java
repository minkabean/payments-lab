package com.paymentslab.paymentsapi.payments;

import com.paymentslab.paymentsapi.payments.PaymentIntentService;
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
public PaymentIntentResponse create(
        @RequestHeader("Idempotency-Key") String idempotencyKey,
        @Valid @RequestBody CreatePaymentIntentRequest request
) {
    return service.create(idempotencyKey, request.amount(), request.currency());
}


    
}


