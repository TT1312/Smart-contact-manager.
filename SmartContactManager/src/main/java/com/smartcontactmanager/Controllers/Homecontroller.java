package com.smartcontactmanager.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartcontactmanager.entities.Users;
import com.smartcontactmanager.services.serviceInterface;
import com.smartcontactmanager.services.servicesImpl;



@RestController
@RequestMapping("/contact")
public class Homecontroller {
	
	@Autowired
	public serviceInterface serviceinterface;
	
	
	@GetMapping("/home")
	public String home() {
		return "home";
		
	}
	
	@PreAuthorize("hasRole('NORMAL')")
	@GetMapping("/signup")
	public String signup() {
		return "signup";
		
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/tt")
	public String login() {
		return "login";
		
	}
	
	
	@PostMapping("/adduser")
	public String adduser(@RequestBody Users user) {
		return this.serviceinterface.adduser(user);
		
	}
	
	
	
	
	
}
