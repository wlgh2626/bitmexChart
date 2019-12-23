package com.example.demo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;



@SpringBootApplication
public class BitmexApiApplication {

	String targetTestWebsite = "https://www.bitmex.com/api/v1";	
	String targetTradeWebsite = "https://www.bitmex.com/api/v1/trade/bucketed";	 
	
	// https://www.bitmex.com/api/v1/trade?startTime=2017-11-06 
	// https://www.bitmex.com/api/v1/trade/bucketed?startTime=2017-11-06&binSize=1d 
	// gets total of 100 trades from 2017-11-06
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
	
			UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(targetTradeWebsite)
					.queryParam("startTime", "2017-11-06")
					.queryParam("binSize", "1d");
			String paramWebsite = uriBuilder.toUriString();
			testData testData = restTemplate.getForObject( targetTestWebsite , testData.class);
			
			tradeData[] tradeData = restTemplate.getForObject( paramWebsite , tradeData[].class);
			//tradeData[] tradeData = restTemplate.getForObject( targetTradeWebsite , tradeData[].class);
			
			log.info(testData.getName());
			
			
			int j =  tradeData.length;
			for(int i = 0; i < j ; i++) {
				log.info(tradeData[i].getTimestamp());
			}
			
			
			return null;
	}
}
