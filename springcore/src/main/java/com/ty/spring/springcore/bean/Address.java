package com.ty.spring.springcore.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class Address implements Serializable{
	
	private int hno;
	private String country;
}
