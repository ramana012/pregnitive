package com.sun.restservice.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.rest.core.annotation.RestResource;

import com.sun.restservice.entity.User;
@RestResource(exported = false)
public interface RecordingRepositery extends JpaRepository<User, String>{

	
}
