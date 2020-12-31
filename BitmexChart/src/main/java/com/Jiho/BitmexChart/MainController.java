package com.Jiho.BitmexChart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Jiho.BitmexChart.query.QueryParam;

@Controller
public class MainController {

		@RequestMapping("home")
		static String home() {
			return "home.html";
		}
		
		@RequestMapping("mvtest")
		static ModelAndView mvtest(QueryParam param) {
			ModelAndView mv = new ModelAndView();
			mv.addObject("param" , param);
			mv.setViewName("mvtest.html");
			return mv;
		}
		
		@GetMapping("chart")
		static String chart() {
			return "testchart.html";
		}
		
		
}
