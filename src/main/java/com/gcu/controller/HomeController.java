package com.gcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/welcome")
public class HomeController {
 
	@GetMapping("/welcome")
	public String success(Model model) {
		model.addAttribute("Signed in Succesfull", "Welcome");
		return "welcome";
	}
}
