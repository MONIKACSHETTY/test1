package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	//http://localhost:8080/?firstname=monika&lastname=shetty&email=monikacshetty
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String userInfo(@RequestParam(value="firstname", defaultValue="world") String firstname,
			@RequestParam(value="lastname", defaultValue="world") String lastname,
			@RequestParam(value="email", defaultValue="world") String email)
	{
		return "Hello " + firstname+" " + lastname +" "+email;
	}
}
