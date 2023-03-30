package com.gcu.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.entity.ProductEntity;
import com.gcu.service.ProductService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	private ProductService productService;

	public UserController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	@GetMapping("/")
	public String listStudents(Authentication authentication, Model model) {
		model.addAttribute("products", productService.getAllStudents());
		 User u = (User) authentication.getPrincipal();
		 model.addAttribute("cu", u);
		return "userhome";
	}
	
}
