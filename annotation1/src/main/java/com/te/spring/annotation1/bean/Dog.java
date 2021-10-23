package com.te.spring.annotation1.bean;

import lombok.Data;

@Data
public class Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("Dog barks");

	}

	@Override
	public void eat() {
		System.out.println("Dog eats chicken");

	}

}
