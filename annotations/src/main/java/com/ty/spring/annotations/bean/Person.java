package com.ty.spring.annotations.bean;

import java.io.Serializable;

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
	
	public void print()
	{
		System.out.println("printing without xml file");
	}
}
