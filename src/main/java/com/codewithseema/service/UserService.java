package com.codewithseema.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.codewithseema.repository.UserDao;

//@Component
@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public String saveUser()
	{
		boolean f = userDao.save();
		if(f)
		{
			return "Register Successfully";
		}
		else
		{
			return "Server Error";
		}
	}
}
