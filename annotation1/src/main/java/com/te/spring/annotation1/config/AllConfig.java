package com.te.spring.annotation1.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@ComponentScan(basePackages = "com.te.spring.annotation1")
@Import({AnimalConfig.class,PetConfig.class})
public class AllConfig {
	

}
