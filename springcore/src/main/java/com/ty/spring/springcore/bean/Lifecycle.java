package com.ty.spring.springcore.bean;

import java.io.Serializable;

import lombok.Data;
@Data
public class Lifecycle implements Serializable {
	private int id;
	private String name;
	
	public void init() {
		System.out.println("Inside init method");
	}
	public void destroy() {
		System.out.println("Inside destroy method");
	}
}
