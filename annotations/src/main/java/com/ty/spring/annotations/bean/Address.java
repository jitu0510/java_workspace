package com.ty.spring.annotations.bean;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;
@Data
public class Address implements Serializable {
	

	private String hno;

	private String city;

}
