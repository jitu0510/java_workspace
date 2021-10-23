package com.te.spring.annotation1.bean;

import lombok.Data;

@Data
public class Cat implements Animal {

	@Override
	public void sound() {
		System.out.println("Cat mews");

	}

	@Override
	public void eat() {
		System.out.println("Cat eats milk");

	}

}
