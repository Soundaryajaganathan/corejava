package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {
	
	@Bean
	public String getName() {
		return "Company ABC";
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		
		for(String string : context.getBeanDefinitionNames()) {
			//System.out.println(string);
		}
		
		Company c= context.getBean("company", Company.class);
		System.out.println(c.getName());
		System.out.println(c.getLocation());
	}

}
