package com.ty.spring.springcore.bean;

import java.io.Serializable;

import lombok.Data;
@Data
public class Employee implements Serializable{

	private int id;
	private String name;
	public Employee(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
public Employee(String id, String name) {
		System.out.println("Employee(String,String)");
		this.id = Integer.parseInt(id);
		this.name = name;
	}
	
}
