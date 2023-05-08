package com.smartcontactmanager.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartcontactmanager.entities.Contacts;

public interface ContactRepository extends JpaRepository<Contacts,Integer>{
	
}
