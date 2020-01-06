package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class bitmexController {
	
	@GetMapping("/initializeData")						//GET
	  public String greetingForm(Model model) {
	    model.addAttribute("hello", new testDataBuilder());
	    return "hello";
	  }
	
	@PostMapping("/initializeData")
	public tradeData[] createData() {
		testDataBuilder tradeData = new testDataBuilder();
		return null;
		
		//return tradeData.getData(); 
	}
}
