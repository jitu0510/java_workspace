package com.ty.designpattern.singelton;

import java.util.Scanner;

public class MoviesDriver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of seats to be booked: ");
		int noOfTickets = scanner.nextInt();
		Movies movies1 =Movies.getTickets(noOfTickets);
		System.out.println("Enter number of seats to be booked: ");
		noOfTickets = scanner.nextInt();
		Movies movies2 = Movies.getTickets(noOfTickets);

	}

}
