/**
 * 
 */
package com.gcu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gcu.model.CSHChamLogin;
import com.gcu.model.NewUserRegisteration;

import jakarta.validation.Valid;

@Controller
public class CSHMainController {
	
	
	@GetMapping("/")
	public String display(Model model ) {
		
		model.addAttribute("title", "Login Form");
		model.addAttribute("cSHCamLogin", new CSHChamLogin());	
		return "login";
		
	}
	@PostMapping("/doLogin")
	public String doLogin(@Valid CSHChamLogin cSHCamLogin, BindingResult bindingResult, Model model) {
		
		if(bindingResult.hasErrors()) {
			model.addAttribute("title", "Login Form");
			return "login";
		}

		model.addAttribute("cSHCamLogin",cSHCamLogin);
		model.addAttribute("title", "You Are Logged on, Select from the menue");
		return "display";
	}
	//Displays the employee workforce
	@GetMapping("/user")
	public String employeeDetails (Model model) {
		List<NewUserRegisteration> user = new ArrayList<NewUserRegisteration>();
		
		user.add(new NewUserRegisteration("Peter", "Griffin", "cooldaddy@yahoo.com", 8675309, "peter73", "blueeyes12" ));
		
		System.out.println(user);
		
		model.addAttribute("employee", user);		
		return "test";
	}
	//Request the form from registration form html. 
	@GetMapping("/registration_form")
	public String showForm(Model model) {
		model.addAttribute("newUser", new NewUserRegisteration("", "", "", 0, "", ""));
		return "registration_form";
				
	}
	//Saving data from form inputs and displaying them in the welcome.html page
	 @PostMapping("/registration_form")
	    public String submitForm(@ModelAttribute NewUserRegisteration newUser, Model model) {
		model.addAttribute("newUser", newUser);
		 return "welcome";
	    }
	 
	 //Sign up new employee succesfull.
	@GetMapping("/welcome")
	public String welcome(Model model) {
			model.addAttribute("title", "Login Form");
			return "welcome";
			
		}
	
}






	