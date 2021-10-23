package com.food;

import java.util.Scanner;
/*
 * Author@ JITU KUMAR MANDAL
 * */

public class Test {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int order_no=1;
		Bill b=new Bill(order_no++);
		Dish d1=new Dish(1,150,"rice","Description1");
		Dish d2=new Dish(2,100,"daal","Description2");
		Dish d3=new Dish(3,200,"Butter Panner","Description3");
		int option;
		int remove_option,count=0;
		System.out.println("Menu");
		do {
			System.out.println("1. Rice");
			System.out.println("2. Daal");
			System.out.println("3. Butter Paneer");
			System.out.println("4. Remove a Dish");
			System.out.println("5. Sort the Dishes Based on Price");
			System.out.println("6. View the Total Amount");
			System.out.println("7. To Get the Bill");
			System.out.println("0. Exit");
			System.out.println("select a option and select 0 to exit");
		    option=sc.nextInt();
		    switch (option) {
		    case 1: b.addDish(d1);
		    		count++;
		    		break;
		    case 2: b.addDish(d2);
		    		count++;
		    		break;
		    case 3: b.addDish(d3);
		    		count++;
		    		break;
		    case 4: System.out.println("Select the dish to remove");
				    System.out.println("1. Rice");
					System.out.println("2. Daal");
					System.out.println("3. Butter Paneer");
					remove_option=sc.nextInt();
					switch(remove_option)
					{
						case 1: b.removeDish(d1);
								count--;
								break;
						case 2: b.removeDish(d2);
								count--;
								break;
						case 3: b.removeDish(d3);
								count--;
								break;
						default: System.out.println("Please Enter a Valid Option");		
					}
					break;
		    case 5: b.sortByPrice();
		    		//b.displayDishes();
		    		break;
		    case 6: System.out.println(b.calculateTotal()+" Excluding GST");
		    		break;
		    case 7: b.generateBill();
		    		option=0;
		    		break;
		    case 0: if(count>0)
		    			b.generateBill();
		    		break;		
		    default:System.out.println("please enter a valid option");
				
			}
		}while(option!=0);
		
	}

}
