package com.helper;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {
	
	@Bean
	public EntityManagerFactory getEmf() 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		return emf;
	}

}
