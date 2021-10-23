package com.te.spring.annotation1.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.spring.annotation1.bean.Pet;
import com.te.spring.annotation1.config.AllConfig;

public class AnimalTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AllConfig.class);
		Pet pet = (Pet) context.getBean("pet");
		System.out.println(pet);
		

	}

}
