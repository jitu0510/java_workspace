package com.ty.spring.springcore.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.spring.springcore.bean.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
//		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");//ApplicationContext context =....
//		Employee employee = (Employee) factory.getBean("emp");//.... = context.getBean("emp");
//		System.out.println(employee);
//		System.out.println(employee.getId());
//		System.out.println(employee.getName());
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee employee = (Employee) context.getBean("emp");
		System.out.println(employee);
		

	}

}
