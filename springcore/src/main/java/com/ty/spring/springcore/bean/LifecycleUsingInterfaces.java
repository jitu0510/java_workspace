package com.ty.spring.springcore.bean;

import java.io.Serializable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.Data;

@Data
public class LifecycleUsingInterfaces implements Serializable, InitializingBean,DisposableBean {
	private int id;
	private String name;
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("inside afterPropertiesSet");
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy");
		
	}

	

}
