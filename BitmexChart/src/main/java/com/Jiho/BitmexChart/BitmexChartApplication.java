package com.Jiho.BitmexChart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BitmexChartApplication {

	@Bean 
	public RestTemplate getTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	@Bean
	public QueryParam getQueryParam() {
		return new QueryParam();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BitmexChartApplication.class, args);
	}

}
