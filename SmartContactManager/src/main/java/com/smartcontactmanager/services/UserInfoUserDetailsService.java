package com.smartcontactmanager.services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.smartcontactmanager.configuration.UserInfoUserDetails;
import com.smartcontactmanager.dao.UserRepository;
import com.smartcontactmanager.entities.Users;

@Component
public class UserInfoUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<Users> users = userRepository.findByName(username);
		
		return users.map(UserInfoUserDetails::new)
				.orElseThrow(()-> new UsernameNotFoundException("User not found"+username));
	}

}
