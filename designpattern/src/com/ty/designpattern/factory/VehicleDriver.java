package com.ty.designpattern.factory;

public class VehicleDriver {
	public static void printFeatures(Vehicle vehicle)
	{
		vehicle.wheels();
		vehicle.maxSpeed();
		vehicle.fuelType();
	}
}
