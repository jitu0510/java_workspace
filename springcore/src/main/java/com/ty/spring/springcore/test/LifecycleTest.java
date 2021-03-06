package com.ty.spring.springcore.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.spring.springcore.bean.Lifecycle;

public class LifecycleTest {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Lifecycle.xml");
		Lifecycle lifecycle = (Lifecycle) context.getBean("lifecycle");
		System.out.println(lifecycle);
		context.registerShutdownHook(); //context.close();
		
	}

}
