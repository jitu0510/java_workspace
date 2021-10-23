package com.hybernetproject;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data 
 
//@AllArgsConstructor
//@NoArgsConstructor
 @Entity
 @Table(name = "emp_details")
public class Employee implements Serializable{
	@Id
	@Column(name = "eid")
	private int id;
	@Column(name = "ename")
	private String name;
	@Column(name = "esalary")
	private double salary;
	@Column(name = "edesg")
	private String designation;
	

}
