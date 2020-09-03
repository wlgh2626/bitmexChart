package com.Jiho.MVCTest;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RController {
	
	@Autowired
	private RestTemplate template;
	
	
	@GetMapping("/resttest")
	List<Object> rtest(){
		
		Object[] obj = template.getForObject( "https://www.bitmex.com/api/v1/trade/bucketed?startTime=2017-11-06&binSize=1d" , Object[].class);
		return Arrays.asList(obj);
	}
	
}
