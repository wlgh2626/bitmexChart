package com.Jiho.BitmexChart;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestAPIConsumer {
	@Autowired
	private RestTemplate template;
	
	@GetMapping("/resttest")
	List<Object> rtest(){
		Object[] obj = template.getForObject( "https://www.bitmex.com/api/v1/trade/bucketed?startTime=2017-11-06&binSize=1d" , Object[].class);
		return Arrays.asList(obj);
	}
	
	@GetMapping("/xbtusd")
	List<Object> xbtusd(QueryParam param){	//will be called by home controller, (PERPETUAL CONTRACT)
		
		Object[] obj = template.getForObject( "https://www.bitmex.com/api/v1/trade/bucketed?startTime=2017-11-06&binSize=1d" , Object[].class);
		return Arrays.asList(obj);
	}
	
}
