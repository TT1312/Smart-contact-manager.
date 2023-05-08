package com.smartcontactmanager.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartcontactmanager.entities.Contacts;
import com.smartcontactmanager.services.serviceInterface;

@RestController
@RequestMapping("/cont")
public class contactcontroller {

	@Autowired
	public serviceInterface serviceinterface;
	
	@PostMapping("/addcontact")
	public String addcontact(@RequestBody Contacts contact) {
		return this.serviceinterface.addcontact(contact);
		
	}
}
