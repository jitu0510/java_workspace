package com.ty.designpattern.factory;

public class Bike implements Vehicle {

	@Override
	public void wheels() {
		System.out.println("Bike has 2 Wheels");

	}

	@Override
	public void maxSpeed() {
		System.out.println("Max speed is 140 Kmph");

	}

	@Override
	public void fuelType() {
		System.out.println("Fuel Type is Petrol");

	}

}
