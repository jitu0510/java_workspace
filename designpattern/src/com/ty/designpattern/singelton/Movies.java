package com.ty.designpattern.singelton;

public class Movies {
	static int tickets = 50;
	public static Movies movies=null;
	private Movies() {
		
	}
	
	public static Movies getTickets(int noOfTickets)
	{
		if(movies==null)
		{
			movies = new Movies();
		}
		System.out.println("Number of Tickets Available: "+tickets);
		if(tickets>=noOfTickets) {
			tickets-=noOfTickets;
		System.out.println(noOfTickets +" Tickets Booked..!!");
		System.out.println("----------------------------------------------");
		}else {
			System.out.println("Sorry...!!! Enough Tickets not available.");
		}
		
		return movies;
	}

}
