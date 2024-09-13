package com.ride;

public class BikeFactory implements VehicleFactory {
	
	public Vehicle createVehicle() {
		
		return new Bike();
		
	}

}
