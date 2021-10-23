package com.ty.designpattern.factory;

import java.util.Scanner;

public class VehicleFactory {
	public Vehicle getVehicle()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Vehicle Type: ");
		String vehicle = scanner.next();
		if(vehicle.equalsIgnoreCase("car")) {
			return new Car();
		}else if(vehicle.equalsIgnoreCase("bike")) {
			return new Bike();
		}else {
			System.out.println("Please give valid input...!!!");
		}
		
		return null;
	}

}
