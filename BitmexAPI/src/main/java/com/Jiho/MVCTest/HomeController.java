package com.Jiho.MVCTest;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@Autowired
	exampledata retriever;
	
	@RequestMapping("home")
	@ResponseBody
	static String home() {
		return "hello word!";
	}
	
	@RequestMapping("test")
	static String test(@RequestParam("name") String coolerName , HttpSession session) {	// http://localhost:8080/test?name=jiho .Requestparam lets us have different variable name
		ModelAndView mv = new ModelAndView();
		
		//HttpSession session = request.getSession();
		//String name = request.getParameter("name");
		session.setAttribute("name" , coolerName);
		return "home";
	}
	
	@RequestMapping("modeltest")
	static ModelAndView modeltest(@RequestParam("name") String coolerName) {	
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", coolerName);
		mv.setViewName("home");
		//this is same things as test controller above
		return mv;
	}
	
	@RequestMapping("objecttest")
	static ModelAndView objecttest(Vehicle vehicle) {	
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", vehicle);
		mv.setViewName("modelhome");
		//this is same things as test controller above
		return mv;
	}
	
	
}
