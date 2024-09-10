package com.ride;

public class PaypalFactory implements PaymentFactory{
	
	public Payment createPayment(){
	 
		return new PaypalPayment();
	
	}


}
