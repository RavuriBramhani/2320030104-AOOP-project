package com.ride;

public class CreditCardPayment implements Payment {

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub	
		System.out.println("Paid"+amount+"using a credit card..!");
		
	}

}
