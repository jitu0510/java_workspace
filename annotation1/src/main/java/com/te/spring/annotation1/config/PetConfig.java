package com.te.spring.annotation1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.te.spring.annotation1.bean.Pet;

@Configuration
//@ComponentScan(basePackages = "com.te.spring.annotation1")
public class PetConfig {
	
	@Bean(name = "pet")
	public Pet getPet()
	{
		Pet pet = new Pet();
		pet.setName("Spoozy");
		return pet;
	}
}
