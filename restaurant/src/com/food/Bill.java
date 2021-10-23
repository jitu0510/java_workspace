package com.food;
/*
 * Author@ JITU KUMAR MANDAL
 * */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//class to store all the objects of Dish type and do the operations
public class Bill implements Serializable {

	private static final long SerialVersionUID=100L;
	
	//declaring attributes
	
	private ArrayList dishes=new ArrayList();
	private int order_no;
	private LocalDate date;
	private LocalTime time;
	
	//no argument constructor
	public Bill(){
		
	}
	
	//parameterized counstructor
	public Bill(int order_no)
	{
		this.order_no=order_no;
	}
	
	// method to add a dish
	public void addDish(Dish d)
	{
		dishes.add(d);
	}
	
	//method to remove a dish
	public void removeDish(Object o)
	{
		Dish d=(Dish)o;
		dishes.remove(d);
	}
	
	//method to search a dish 
	public void search(Object o)
	{
		Dish d=(Dish)o;
		if(dishes.contains(d))
			System.out.println("Dish is already added");
		else
			System.out.println("Dish is not added");
	}
	
	//method to sort the added dishes based on price
	public void sortByPrice()
	{
		Collections.sort(this.dishes);
		System.out.println("Sorted dishes based on price:");
		Iterator it=dishes.iterator();
		
		while(it.hasNext())
		{
			Dish d=(Dish)it.next();
			System.out.println(d.name);
		}
		
	}
	
	//method to calculate total price of the added dishes exclusive taxes
	public double calculateTotal()
	{
		double total=0;
		Iterator it=dishes.iterator();
		while(it.hasNext())
		{
			Dish d=(Dish)it.next();
			total+=d.price;
		}
		return total;
	}
	
	//method to display the added dishes
	public void displayDishes()
	{
		Iterator it=dishes.iterator();
		while(it.hasNext())
		{
			Dish d=(Dish)it.next();
			System.out.println(d.name);
		}
	}
	
	//thread safe method for generating bill
	synchronized public void generateBill()
	{   
		//checking if no dish added
		if(dishes.isEmpty())
		{
			throw new NoDishException("No Dish Added...Cannot generate Bill");
		}
		try {
		File f=new File("D:/Bill.txt");
		PrintWriter bill =new PrintWriter(f);
		bill.println(LocalDate.now());
		bill.println(LocalTime.now());
		bill.println("Order Number: "+order_no);
		bill.println("------------------------------------");
		bill.println("Dish Price");
		
		//to iterate over the Arraylist
		Iterator it=dishes.iterator();
		while(it.hasNext())
		{
			Dish d=(Dish)it.next();
			//calculating the total
			bill.println(d.name+"  "+d.price);
		}
		bill.println("------------------------------");
		bill.println("Total "+calculateTotal());
		bill.println("SGST 5%");
		bill.println("CGST 5%");
		bill.println("------------------------------");
		bill.println("TOTAL "+calculateTotal());
		bill.println("------------------------------");
		bill.println("Total Amount To Be Paid Is Rs "+(calculateTotal()*1.1)+" Only");
		bill.println("******************************");
		bill.close();
		bill.flush();
		//bill generated and saved in the file
		
		}
		catch(FileNotFoundException e)
		{
			/*if exception occurs then the reason of exception is
			 * printed on the console and no file is generated
			**/
			System.out.println(e.getMessage());
		}
	}
	

}
