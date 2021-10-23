package com.ty.spring.springcore.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.spring.springcore.bean.Student;

public class StudentTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("studentbean.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student.getNames());
		System.out.println(student.getRollno());
		System.out.println(student.getCourses());
		
	}

}
