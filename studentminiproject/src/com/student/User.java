package com.student;

import java.util.Scanner;

/*
 * Author@Jitu Kumar Mandal
 * */
public class User {

	
	public static void main(String[] args) {
		try {
		Student s=new Student();
		Scanner sc=new Scanner(System.in);
		int id;
		String name;
		String email;
		String grade;
		double marks;
		boolean exit=true;
		do {
			System.out.println("select a option: ");
			System.out.println("1. Insert Student details");
			System.out.println("2. Get Student Details");
			System.out.println("3. Update Email Id");
			System.out.println("4. Remove Student Data");
			System.out.println("5. Get Student Marks");
			System.out.println("6. Get Student Grade");
			System.out.println("0. Exit");
			int option=sc.nextInt();
			switch(option)
			{
				case 1: System.out.println("Enter Student Id: ");
				        id=sc.nextInt();
				        System.out.println("Enter Student Email: ");
				        email=sc.next();
				        System.out.println("enter Student Name: ");
				        name=sc.next();
				        System.out.println("Enter Marks: ");
				        marks=sc.nextDouble();
				        grade="";
				        if(marks>=9.1) {
				        	grade="A+";
				        }else if(marks>8.1)
				        {
				        	grade="A";
				        }else if(marks>7.1)
				        {
				        	grade="B";
				        }else if(marks>6.1)
				        {
				        	grade="C";
				        }else if(marks>5.1)
				        {
				        	grade="D";
				        }else if(marks>4.1)
				        {
				        	grade="E";
				        }else
				        {
				        	grade="F";
				        }
				        s.insertUser(email, marks, name, grade);
				        break;
				case 2: System.out.println("Enter Student Id: ");
				        id=sc.nextInt();
				        s.searchStudent(id);
				        break;
				        
				case 3: System.out.println("Enter Student Id: ");
				        id=sc.nextInt();
				        System.out.println("Enter new Email Id");
				        email=sc.next();
				        s.updateEmail(id, email);
				        break;
				        
				case 4: System.out.println("Enter Id to remove Student Data: ");
				        id=sc.nextInt();
				        s.deleteStudent(id);
				        break;
				        
				case 5: System.out.println("Enter Student Id: ");
						id=sc.nextInt();
						s.printMarks(id);
						break;
						
				case 6:  System.out.println("Enter Student Id: ");
						id=sc.nextInt();		
						s.printGrade(id);
						break;
						
				case 0: exit=false;
						break;
						
				default: System.out.println("Enter Valid Option");        
			}
			
			
		}while(exit);
		}catch(Exception e)
		{
			System.out.println("Some Problem Occured...!!!");
		}
	}
}

