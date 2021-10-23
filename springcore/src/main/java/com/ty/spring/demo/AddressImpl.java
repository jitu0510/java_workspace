package com.ty.spring.demo;

import java.io.Serializable;

import lombok.Data;

@Data
public class AddressImpl implements Address,Serializable {
	private int hno;
	private String country;
	
}
