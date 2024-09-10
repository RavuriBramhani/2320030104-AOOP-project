package com.ride;

public class CreditcardFactory implements PaymentFactory {
	
	@Override
	public Payment createPayment() {
		// TODO Auto-generated method stub
		return new CreditCardPayment();
		
	}
}
