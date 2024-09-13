package com.ride;

public class ScooterFactory implements VehicleFactory {
	
public Vehicle createVehicle() {
		
		return new Scooter();
		
	}

}
