package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BaseController {
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
	String message = "<br><div align='center'>" + "<h3>********** Hello World! **********<br><br>";
	return new ModelAndView("welcome", "message", message);
	}
}
