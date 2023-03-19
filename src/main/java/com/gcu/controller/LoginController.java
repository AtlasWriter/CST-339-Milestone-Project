package com.gcu.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.gcu.entity.UserLoginModel;

@Controller
public class LoginController {
	
	/**
	 * Displays the basic Login Form page
	 * @param model
	 * @return login.html
	 */
	
	@GetMapping(value = "/login")
	public String displayLogin(Model model)
	{
		model.addAttribute("title", "Login Form");
		model.addAttribute("userLoginModel",new UserLoginModel());
		return "products";
	}
	@PostMapping("/")
	public String doLogin(@Valid UserLoginModel userLoginModel, BindingResult bindingResult, Model model) {
		
		if(bindingResult.hasErrors()) {
			model.addAttribute("title", "Login Form");
			return "login";
		}
		model.addAttribute("userLoginModel",userLoginModel);
		model.addAttribute("title", "You Are Logged on, Select from the menue");
		return "products";
	}
}


