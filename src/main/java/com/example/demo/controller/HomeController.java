package com.example.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@RestController
@RequestMapping("/users")
public class HomeController {
	@GetMapping()
	public User show()
	{
		User obj=new User();
		obj.setEmail("sk@gmail.com");
		obj.setName("sachin");
		return obj;
	}
	
	

}
