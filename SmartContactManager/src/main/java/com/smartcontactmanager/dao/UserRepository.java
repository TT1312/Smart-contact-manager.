package com.smartcontactmanager.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartcontactmanager.entities.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{

	Optional<Users> findByName(String username);

}
