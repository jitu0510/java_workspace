package com.ty.spring.demo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public class Person implements Serializable {
	private int id;
	private String name;
	
	private Address address;
}
