package com.Jiho.BitmexChart.API;
// Select Parameter from home.html, then build URL from it...
// Rest API from RestTemplateBuilder
// sanitize data in Candle Converter
// Save The Candle data from Candle Converter as JSON
// Chart.html reads the data JSON, and converts it in to a chart...
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.Jiho.BitmexChart.candle.CandleData;
import com.Jiho.BitmexChart.query.QueryParam;

@RestController
public class API_Controller {
	@Autowired
	private RestTemplate template;
	
	private CandleData data;
	private QueryParam param;
	
	//http://localhost:8080/api/foos?id=abc&name=jiho
	@GetMapping("/api/foos")
	public String getFoos(@RequestParam String id, @RequestParam String name) {
	    return "ID: " + id + name;
	}
	
	@GetMapping("/bitmex")
	public String bitmex(@RequestParam String id, @RequestParam String name) {
	    return "ID: " + id + name;
	}
	
	//"https://www.bitmex.com/api/v1/trade/bucketed?startTime=2017-11-06&binSize=1d"
	//Build this query from QueryParam
	@GetMapping("/resttest")
	List<Object> rtest(){
		Object[] obj = template.getForObject( "https://www.bitmex.com/api/v1/trade/bucketed?startTime=2017-11-06&binSize=1d" , Object[].class);
		
		data = new CandleData(obj);
		return Arrays.asList(obj);
	}
	
	
	@GetMapping("/xbtusd")
	List<Object> xbtusd(QueryParam param){	//will be called by home controller, (PERPETUAL CONTRACT)
		
		Object[] obj = template.getForObject( "https://www.bitmex.com/api/v1/trade/bucketed?startTime=2017-11-06&binSize=1d" , Object[].class);
		return Arrays.asList(obj);
	}
	
}
