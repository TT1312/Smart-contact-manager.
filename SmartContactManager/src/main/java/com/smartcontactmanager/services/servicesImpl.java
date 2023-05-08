package com.smartcontactmanager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.smartcontactmanager.dao.ContactRepository;
import com.smartcontactmanager.dao.UserRepository;
import com.smartcontactmanager.entities.Contacts;
import com.smartcontactmanager.entities.Users;

@Service
public class servicesImpl implements serviceInterface{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ContactRepository contactrepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public String adduser(Users users) {
		
		users.setPassword(passwordEncoder.encode(users.getPassword()));
		userRepository.save(users);
		return "user add successfully";
	}

	public String addcontact(Contacts contact) {
		contactrepository.save(contact);
		return "user add successfully";
	}
}
