package com.paymentslab.paymentsapi.payments.repository;

import org.springframework.stereotype.Repository;

import com.paymentslab.paymentsapi.payments.model.PaymentIntentEntity;


public interface PaymentIntentRepository extends org.springframework.data.jpa.repository.JpaRepository<PaymentIntentEntity, java.util.UUID> {
    
}
