package com.te.spring.annotation1.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Address {
	@Value("10")
	private int hno;
	public void printAddress()
	{
		System.out.println("this is my address");
	}

}
