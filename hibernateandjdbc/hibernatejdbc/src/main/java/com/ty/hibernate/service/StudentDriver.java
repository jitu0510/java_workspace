package com.ty.hibernate.service;

import java.util.Scanner;

import com.ty.hibernate.dao.StudentImpl;
import com.ty.hibernate.dto.Student;

public class StudentDriver {
	Student student = new Student();
	static StudentImpl studentImpl = new StudentImpl();
	public static void findAll() {
	
	studentImpl.findAll();

	}

	
	public static void findData() {
		System.out.println("enter student Id:");
		Scanner scanner = new Scanner(System.in);
		int id= scanner.nextInt();
		if(id>0)
			studentImpl.findData(id);
		else
			System.out.println("please enter valid id");

	}

	
	public static void updateName() {
		System.out.println("enter student Id:");
		Scanner scanner = new Scanner(System.in);
		int id= scanner.nextInt();
		if(id>0) {
			System.out.println("Enter new Name: ");
			String name = scanner.next();
			studentImpl.updateName(id, name);
		}
		else
			System.out.println("please enter valid id");


	}

	
	public static void updatePhone() {
		System.out.println("enter student Id:");
		Scanner scanner = new Scanner(System.in);
		int id= scanner.nextInt();
		if(id>0)
		{
			System.out.println("Enter phone number to update: ");
			int phone = scanner.nextInt();
			studentImpl.updatePhone(id, phone);
		}
		else
			System.out.println("please enter valid id");


	}

	
	public static void updateStandard() {
		System.out.println("enter student Id:");
		Scanner scanner = new Scanner(System.in);
		int id= scanner.nextInt();
		if(id>0)
		{
			System.out.println("Enter new Standard");
			String standard = scanner.next();
			studentImpl.updateStandard(id, standard);
		}
		else
			System.out.println("please enter valid id");


	}

	
	public static void updateId() {
		System.out.println("enter student Id:");
		Scanner scanner = new Scanner(System.in);
		int id= scanner.nextInt();
		if(id>0)
		{
			System.out.println("enter new Id: ");
			int newId = scanner.nextInt();
			studentImpl.updateId(id, newId);
		}
		else
			System.out.println("please enter valid id");


	}

	
	public static void deleteStudent() {
		System.out.println("enter student Id:");
		Scanner scanner = new Scanner(System.in);
		int id= scanner.nextInt();
		if(id>0)
			studentImpl.deleteStudent(id);
		else
			System.out.println("please enter valid id");


	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		boolean exit=false;
		do {
			System.out.println("Press 1 to see all data");
			System.out.println("Press 2 to see any particular data");
			System.out.println("Press 3 to update any particular data");
			System.out.println("Press 4 to delete data");
			System.out.println("Press 0 to Exit");
			System.out.println("Select one option: ");
			int option = scanner.nextInt();
			switch(option) {
			case 1: findAll();
					break;
			case 2: findData();
					break;
			case 3: System.out.println("Do you want to update name(Y/N)");
					char nameOption=scanner.next().charAt(0);
					if(nameOption=='Y' || nameOption=='y') 
						updateName();	
					System.out.println("Do you want to update phone number(Y/N)");
					char phoneOption=scanner.next().charAt(0);
					if(phoneOption=='Y' || phoneOption=='y')
						updatePhone();
					System.out.println("Do you want to update Standard(Y/N)");
					char standardOption=scanner.next().charAt(0);
					if(standardOption=='Y' || standardOption=='y')
						updateStandard();
					System.out.println("Do you want to update Roll Number(Y/N)");
					char idOption=scanner.next().charAt(0);
					if(idOption=='Y' || idOption=='y')
						updateId();
					break;
			case 4: deleteStudent();
					break;
			case 5: exit=true;
					break;
			default: System.out.println("please give valid input..!!");		
			}
		}while(!exit);

	}

}
