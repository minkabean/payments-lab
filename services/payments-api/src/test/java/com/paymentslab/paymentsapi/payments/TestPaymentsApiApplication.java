package com.paymentslab.paymentsapi.payments;

import org.springframework.boot.SpringApplication;

import com.paymentslab.paymentsapi.PaymentsApiApplication;

public class TestPaymentsApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(PaymentsApiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
