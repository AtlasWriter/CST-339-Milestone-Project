package com.gcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.gcu.entity.UserEntity;
import com.gcu.service.UserService;


@Controller
public class EmployeeController {
	
	private UserService userService;

	public EmployeeController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	// handler method to handle list students and return mode and view
	@GetMapping("/users")
	public String listUsers(Model model) {
		model.addAttribute("users", userService.getAllStudents());
		return "users";
	}
	
	@GetMapping("/users/new")
	public String createUserForm(Model model) {
		
		// create student object to hold student form data
		UserEntity userEntity = new UserEntity();
		model.addAttribute("user", userEntity);
		return "create_user";
		
	}
	
	@PostMapping("/users")
	public String saveUser(@ModelAttribute("user") UserEntity userEntity) {
		userService.saveUser(userEntity);
		return "redirect:/users";
	}
	
	@GetMapping("/users/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("user", userService.getUserById(id));
		return "edit_user";
	}

	@PostMapping("/users/{id}")
	public String updateUser(@PathVariable Long id,
			@ModelAttribute("user") UserEntity userEntity,
			Model model) {
		
		// get student from database by id
		UserEntity existingStudent = userService.getUserById(id);
		existingStudent.setId(id);
		existingStudent.setFirstName(userEntity.getFirstName());
		existingStudent.setLastName(userEntity.getLastName());
		existingStudent.setUsername(userEntity.getUsername());
		existingStudent.setEmail(userEntity.getEmail());
		existingStudent.setPassword(userEntity.getPassword());
		
		// save updated student object
		userService.updateUser(existingStudent);
		return "redirect:/users";		
	}
	
	// handler method to handle delete student request
	
	@GetMapping("/users/{id}")
	public String deleteUser(@PathVariable Long id) {
		userService.deleteUserById(id);
		return "redirect:/users";
	}
	
}