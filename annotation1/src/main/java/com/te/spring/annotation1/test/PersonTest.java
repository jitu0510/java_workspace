package com.te.spring.annotation1.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.spring.annotation1.bean.Person;
import com.te.spring.annotation1.config.PersonConfig;

public class PersonTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);
		Person person = (Person) context.getBean("person");
		System.out.println(person.getName());
		person.print();
	}

}

