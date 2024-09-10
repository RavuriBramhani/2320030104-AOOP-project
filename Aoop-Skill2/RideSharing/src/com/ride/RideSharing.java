package com.ride;

public class RideSharing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserAuthentication authentication=UserAuthentication.getInstance();
		boolean isAuthenticate=authentication.authenticateUser("username","password");
		if (isAuthenticate) {
		
		VehicleFactory carFactory = new CarFactory();
		Vehicle car = carFactory.createVehicle();
		car.requestride();
		
		VehicleFactory bikeFactory = new BikeFactory();
		Vehicle bike = bikeFactory.createVehicle();
		bike.requestride();
	
		VehicleFactory scooterFactory = new ScooterFactory();
		Vehicle scooter = scooterFactory.createVehicle();
		scooter.requestride();
		
		PaymentFactory creditCardFactory = new CreditcardFactory();
		Payment creditCardPayment = creditCardFactory.createPayment();
		creditCardPayment.pay(20.0);
		PaymentFactory payPalFactory = new PaypalFactory();
		Payment payPalPayment = payPalFactory.createPayment();
		payPalPayment.pay(15.0);
		}
		else {
		System.out.println("Authentication failed. Unable to request a ride or make a payment.");
		}

	}

}
