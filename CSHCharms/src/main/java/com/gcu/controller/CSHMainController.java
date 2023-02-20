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
	public String display(Model model) {
		
		model.addAttribute("title", "Login Form");
		model.addAttribute("cSHCamLogin", new CSHChamLogin());	
		return "login";
		
	}
	@PostMapping("/")
	public String isLogedIn(@ModelAttribute CSHChamLogin logedOn, Model model) {
		model.addAttribute("cSHCamLogin",logedOn);
		model.addAttribute("title", "You Are Logged on, Select from the menue");
		return "display";
	}
	@GetMapping("/user")
	public String employeeDetails (Model model) {
		List<NewUserRegisteration> user = new ArrayList<NewUserRegisteration>();
		
		user.add(new NewUserRegisteration("Peter", "Griffin", "cooldaddy@yahoo.com", 8675309, "peter73", "blueeyes12" ));
		
		System.out.println(user);
		
		model.addAttribute("employee", user);		
		return "test";
	}
	
	@GetMapping("/registration_form")
	public String showForm(Model model) {
		model.addAttribute("newUser", new NewUserRegisteration("", "", "", 0, "", ""));
		return "registration_form";
				
	}
	 @PostMapping("/registration_form")
	    public String submitForm(@ModelAttribute NewUserRegisteration newUser, Model model) {
		model.addAttribute("newUser", newUser);
		 return "welcome";
	    }
	 
	 
	@GetMapping("/welcome")
	public String welcome(Model model) {
			model.addAttribute("title", "Login Form");
			return "welcome";
			
		}
	
}






	