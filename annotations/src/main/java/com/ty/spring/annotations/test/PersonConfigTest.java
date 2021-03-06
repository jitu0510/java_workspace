package com.ty.spring.annotations.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.spring.annotations.bean.Person;
import com.ty.spring.annotations.config.PersonConfig;

public class PersonConfigTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);
		Person person = (Person) context.getBean("person");
		person.getName();

	}

}
