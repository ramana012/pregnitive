package com.sun.restservice.repository;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.sun.restservice.entity.User;

//@RepositoryRestResource(path = "/users")
@RestResource(exported = false)
public interface UserRepository   extends JpaRepository<User, String>{
	}
