package com.te.spring.annotation1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.spring.annotation1.bean.Cat;
import com.te.spring.annotation1.bean.Dog;

@Configuration
//@ComponentScan(basePackages = "com.te.spring.annotation1")
public class AnimalConfig {

	@Bean(name = "dog")
	@Primary
	public Dog getDog()
	{
		return new Dog();
	}
	@Bean(name = "cat")
	public Cat getCat()
	{
		return new Cat();
	}
	
	
}
