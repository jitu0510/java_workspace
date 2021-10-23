package com.ty.spring.springcore.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.spring.springcore.bean.Lifecycle;
import com.ty.spring.springcore.bean.LifecycleUsingInterfaces;

public class LifecycleUsingInterfacesTest {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("LifecycleUsingInterface.xml");
		LifecycleUsingInterfaces lifecycle = (LifecycleUsingInterfaces) context.getBean("lifecycle");
		System.out.println(lifecycle);
		context.registerShutdownHook();

	}

}
