package com.Jiho.BitmexChart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

		@RequestMapping("home")
		static String home() {
			return "home";
		}
		
		
		@RequestMapping("mvtest")
		static ModelAndView mvtest(QueryParam param) {
			ModelAndView mv = new ModelAndView();
			mv.addObject("param" , param);
			mv.setViewName("mvtest");
			return mv;
		}
		
		
		
}
