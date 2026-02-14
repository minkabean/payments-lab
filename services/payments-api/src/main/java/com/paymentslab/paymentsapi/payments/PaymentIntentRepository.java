package com.paymentslab.paymentsapi.payments;

import org.springframework.stereotype.Repository;


public interface PaymentIntentRepository extends org.springframework.data.jpa.repository.JpaRepository<PaymentIntentEntity, java.util.UUID> {
    
}
