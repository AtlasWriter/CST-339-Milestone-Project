package com.gcu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import com.gcu.entity.UserEntity;
import com.gcu.repository.UserRepository;

@SpringBootApplication
public class Milestone_6 {

	public static void main(String[] args) {
		SpringApplication.run(Milestone_6.class, args);
	}

	@Autowired
	private UserRepository studentRepository;

}
