package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;



@SpringBootApplication
public class BitmexApiApplication {

	String targetWebsite = "https://www.bitmex.com/api/v1";		
	private static final Logger log = LoggerFactory.getLogger(BitmexApiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BitmexApiApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
	
			testData data = restTemplate.getForObject( targetWebsite , testData.class);
			log.info(data.getName());
			return null;
	}
}
