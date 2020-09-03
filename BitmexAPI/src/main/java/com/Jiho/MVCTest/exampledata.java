package com.Jiho.MVCTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class exampledata {
	
	@Autowired
	RestTemplate template;
	
	public exampledata() {
		System.out.println("API Retriever wired");
	}
	
	public data[] getData() {
		data[] d = template.getForObject( "https://www.bitmex.com/api/v1/trade/bucketed?startTime=2017-11-06&binSize=1d" , data[].class); //the The rest call will store the data inside data[].class
		
		return d;
	}
}

// {"name":"BitMEX API","version":"1.2.0","timestamp":1598985828877}