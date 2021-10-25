package com.ty.springmvc.bean;

import java.io.Serializable;

import lombok.Data;
@Data
public class LoginDetails implements Serializable {

	private String name;
	private String pwd;//same variable_name as the name attribiute in the form i.e home.jsp
}
