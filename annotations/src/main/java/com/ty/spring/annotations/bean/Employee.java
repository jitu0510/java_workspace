package com.ty.spring.annotations.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Employee implements Serializable {
	@Value("jitu")
	private String name;
	@Value("101")
	private int id;
	
	@Autowired
	@Qualifier("addr")
	private Address address;

//	public Address getAddress() {
//		return address;
//	}
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}

	
	
	
}
