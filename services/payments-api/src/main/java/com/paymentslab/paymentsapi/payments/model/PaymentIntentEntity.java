package com.paymentslab.paymentsapi.payments.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "payment_intents")
@Getter
@Setter
public class PaymentIntentEntity {

    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "amount", nullable = false)
    private long amount;

    @Column(name = "currency", length = 3, nullable = false)
    private String currency;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt;
}
