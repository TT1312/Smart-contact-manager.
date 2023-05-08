package com.ecomerce.EcommerceWebsite.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/ecom")
public class HomepageController {
	
	@GetMapping("/home")
	public String homepage() {
		return "Welcome to My E-commerce Website ";
		
	}
	
	
}
