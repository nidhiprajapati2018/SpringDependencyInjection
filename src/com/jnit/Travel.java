package com.jnit;

public class Travel implements Journey {
	
	private Vehicle vehicle;

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public void startJourney() {
		System.out.println("Started journey......");
		vehicle.move();
	}

}
