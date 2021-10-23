package com.ty.designpattern.factory;

public class Car implements Vehicle {

	@Override
	public void wheels() {
		System.out.println("Car has 4 Wheels");

	}

	@Override
	public void maxSpeed() {
		System.out.println("Max Speed is 220Kmph");
	}

	@Override
	public void fuelType() {
		System.out.println("Fuel Type is Diesel");

	}

}
