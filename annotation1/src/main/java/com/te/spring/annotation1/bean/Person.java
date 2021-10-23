package com.te.spring.annotation1.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data 
public class Person implements Serializable {
	@Value("jitu")
	private String name;
	@Value("dhn")
	private String place;
	@Autowired
	private Address address;
	
	public void print()
	{
		address.printAddress();
		System.out.println("printing without xml file");
	}

	
}
