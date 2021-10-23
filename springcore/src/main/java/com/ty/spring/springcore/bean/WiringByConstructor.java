package com.ty.spring.springcore.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class WiringByConstructor implements Serializable  {
	private int id;
	private Address address;

}
