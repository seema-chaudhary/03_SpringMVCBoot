package com.codewithseema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home()
	{
		System.out.println("This is home url");
		return "home";
	}

	
	@RequestMapping("/contact")
	public String contact()
	{
		System.out.println("This is contact url");
		return "contact";
	}
}
