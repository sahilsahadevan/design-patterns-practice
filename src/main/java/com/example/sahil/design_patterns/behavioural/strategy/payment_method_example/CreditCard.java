package com.example.sahil.design_patterns.behavioural.strategy.payment_method_example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreditCard implements PaymentStrategy {
	private final Logger log = LoggerFactory.getLogger(CreditCard.class);
	private String name, cardNumber, cvv, dateOfExpiry;
	
	public CreditCard(String nm, String ccNum, String cvv, String expiryDate){
		this.name=nm;
		this.cardNumber=ccNum;
		this.cvv=cvv;
		this.dateOfExpiry=expiryDate;
	}

	@Override
	public void pay(int amount) { log.info("{} paid with credit/debit card",amount); }

}