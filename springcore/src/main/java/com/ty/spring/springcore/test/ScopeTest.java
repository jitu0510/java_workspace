package com.ty.spring.springcore.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.spring.springcore.bean.ScopeSingleton;

public class ScopeTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("scope.xml");
		ScopeSingleton singleton = (ScopeSingleton) context.getBean("single");
		System.out.println(singleton.hashCode());
		
		ScopeSingleton singleton2= (ScopeSingleton) context.getBean("single");
		System.out.println(singleton2.hashCode());

	}

	
}
