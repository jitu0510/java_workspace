package com.te.spring.annotation1.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;
@Data
public class Pet implements Serializable{
	private String name;
	
	@Autowired
	private Animal animal;
	

}
