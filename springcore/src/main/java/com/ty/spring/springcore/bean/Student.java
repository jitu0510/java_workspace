package com.ty.spring.springcore.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.Data;

@Data
public class Student implements Serializable {

	private List<String> names;
	private Set<Integer> rollno;
	private Map<Integer,String> courses;
	
}
