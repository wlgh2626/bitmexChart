package com.Jiho.MVCTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class MvcTestApplication {
	

	@Bean
	public RestTemplate getTemplate(RestTemplateBuilder builder) {	//@autowired is the consumer. @Bean is the producer. You CANNOT have 2 beans returning same type! Use qualifier to have 2
		return builder.build();
	}
	
	@Bean exampledata getExampleData() {
		return new exampledata();
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(MvcTestApplication.class, args);
		
	}

}
