package com.ty.spring.springcore.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.spring.springcore.bean.Person;

public class PersonTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("reference.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person);

	}

}
