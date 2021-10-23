package com.ty.hibernate.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
public class Student implements Serializable {
	@Id
	private int rollno;
	private String name;
	private int phoneno;
	private String standard;
	

}
