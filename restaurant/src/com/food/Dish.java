package com.food;
/*
 * Author@ JITU KUMAR MANDAL
 * */

// Dish class to contains the properties of all the dishes
public class Dish implements Comparable {

	// declaring attributes
	int d_id;
	double price;
	String name;
	String description;
	//parameterized constructor
	public Dish(int d_id,double price,String name,String description) {
		this.d_id=d_id;
		this.price=price;
		this.name=name;
		this.description=description;

	}
	//setter methods
	public void setDishId(int d_id)
	{
		this.d_id=d_id;
	}
	public void setDish(String name)
	{
		this.name=name;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	public void setDescription(String description)
	{
		this.description=description;
	}
	
	//getter methods 
	public String getDish()
	{
		return name;
	}
	public int getDishId()
	{
		return d_id;
	}
	public double getPrice()
	{
		return price;
	}
	public String getDescription()
	{
		return description;
	}
	//overridding method for comparing based on price
	@Override
	public int compareTo(Object o)
	{
		Dish d=(Dish)o;
		if(this.price==d.price)
			return 0;
		else if(this.price>d.price)
			return 1;
		else 
			return -1;
	}
	
	//overriding Object methods
	@Override
	public String toString()
	{
		return d_id+" "+name+" "+price+" "+description;
	}
	@Override
	public int hashCode()
	{
		int h1=d_id;
		int h2=(int)price;
		int h3=name.hashCode();
		int h4=description.hashCode();
		return (h1+h2+h3+h4);
	}
	@Override
	public boolean equals(Object o)
	{
		Dish d=(Dish)o;
		if(this.name.equals(d.name) && this.d_id==d.d_id && this.price==d.price && this.description.equals(d.description))
			return true;
		else
			return false;
	}
	
}
