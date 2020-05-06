package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class bitmexController {
	
	
	@GetMapping("/tryTest")
	public String pp() {
		return "testForm";	//this returns testForm.html
	}
	
	
	
	
	@RequestMapping("/setQuery")
	public ModelAndView test(HttpServletRequest request, HttpServletResponse response) {
		
		String test1 = request.getParameter("t1");
		String dateStart= request.getParameter("dateStart");
		String dateEnd= request.getParameter("dateEnd");
		String dateInterval= request.getParameter("dateInterval");
		String Symbol = request.getParameter("Symbol");
		
		testDataBuilder builder = new testDataBuilder();
		tradeData[] tradeData = builder.buildData(dateStart, dateEnd, Symbol, dateInterval);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("testing");
		//mv.addObject("result", test1);
		
		mv.addObject("result", tradeData);
		return mv;
	}
	
	
	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		return "testForm";
	}
	
	
}
