package com.smartcontactmanager.services;

import com.smartcontactmanager.entities.Contacts;
import com.smartcontactmanager.entities.Users;

public interface serviceInterface {

	public String adduser(Users users);
	
	public String addcontact(Contacts contact);
}
