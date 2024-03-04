package com.wissen.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wissen.dao.UserRepository;
import com.wissen.entities.User;

@RestController
public class HomeController 
{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private User user;
	
	
	@GetMapping("/test")
	public String test()
	{
		User user=new User();
		
		user.setName("sukesh");
		user.setEmail("SUkesh@gmail.com");
		
		userRepository.save(user);
		
		return "working";
	}
	
	
	
}
