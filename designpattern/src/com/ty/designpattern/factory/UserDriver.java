package com.ty.designpattern.factory;

public class UserDriver {

	public static void main(String[] args) {
		VehicleFactory factory = new VehicleFactory();
		Vehicle vehicle = factory.getVehicle();
		if(vehicle!=null) {
		VehicleDriver.printFeatures(vehicle);
		}
	}

}
