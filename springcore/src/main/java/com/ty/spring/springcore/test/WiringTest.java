package com.ty.spring.springcore.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.spring.springcore.bean.WiringByConstructor;

public class WiringTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("constructorwiring.xml");
		WiringByConstructor wiriConstructor =  (WiringByConstructor) context.getBean("wiringbyconstructor");
		System.out.println(wiriConstructor);
	}

}
