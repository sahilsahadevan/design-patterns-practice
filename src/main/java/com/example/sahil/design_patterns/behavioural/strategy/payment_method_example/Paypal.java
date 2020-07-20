package com.example.sahil.design_patterns.behavioural.strategy.payment_method_example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Paypal implements PaymentStrategy {
	private final Logger log = LoggerFactory.getLogger(Paypal.class);
	private String emailId, password;
	
	public Paypal(String email, String pwd){
		this.emailId=email;
		this.password=pwd;
	}
	
	@Override
	public void pay(int amount) {
		log.info("{} paid using Paypal.", amount);
	}

}