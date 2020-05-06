package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;


@Component
public class testDataBuilder{
	
		private static final Logger log = LoggerFactory.getLogger(BitmexApiApplication.class);

		public tradeData[] buildData(String dateStart, String dateEnd, String Symbol, String dateInterval){
			
			
			RestTemplate restTemplate = new RestTemplate();
			String targetTradeWebsite = "https://www.bitmex.com/api/v1/trade/bucketed";	
			UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(targetTradeWebsite)
					.queryParam("startTime", dateStart)
					.queryParam("binSize", dateInterval)
					.queryParam("symbol", Symbol);
			
			String paramWebsite = uriBuilder.toUriString();
			tradeData[] tradeData = restTemplate.getForObject( paramWebsite , tradeData[].class);
			
			int j =  tradeData.length;
			
			/*
			for(int i = 0; i < j ; i++) {
				log.info(tradeData[i].getTimestamp());
			}
			*/
			
			return tradeData;
		}
		
		
		
}
