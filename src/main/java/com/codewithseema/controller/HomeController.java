package com.codewithseema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codewithseema.service.UserService;

@Controller
public class HomeController {
// field injection
//	@Autowired
//	private UserService userService;
	
	// constructor injection this is will also work fine
	private UserService userService;
	public HomeController(UserService userService) {
		this.userService = userService;
	}
	
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
	
	@RequestMapping("/")
	public String home1()
	{
		System.out.println("Home page is calling....for Registration");
		return "home1";
	}
	
	
	
	@RequestMapping("/createUser")
	public String registerUser()
	{
		String msg = userService.saveUser();
		System.out.println(msg);
		return "success";
	}
}
