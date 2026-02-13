package com.paymentpractice.payments_api;

import org.springframework.boot.SpringApplication;

public class TestPaymentsApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(PaymentsApiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
