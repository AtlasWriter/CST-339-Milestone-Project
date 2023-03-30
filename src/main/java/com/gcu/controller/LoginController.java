package com.gcu.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.dto.LoginDto;
import com.gcu.entity.UserLoginModel;
import com.gcu.service.ProductService;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;

@Controller
@RequestMapping("/")
public class LoginController {

	private ProductService productService;
 
	public LoginController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("login")
	public String displayLogin(Model model) {
		model.addAttribute("title", "Login Form");
		model.addAttribute("loginDto", new LoginDto());
		return "login";
	}

	@PostMapping("/dologin")
	public String doLogin(@Valid UserLoginModel loginDto, Model model) {

		model.addAttribute("userLoginModel", loginDto);
		model.addAttribute("title", "You Are Logged on, Select from the menue");
		return "welcome";
	}

	@GetMapping("/welcome")
	public String success(Authentication authentication, Model model) {
		model.addAttribute("Signed in Succesfull", "Welcome");
		model.addAttribute("products", productService.getAllStudents());
		User u = (User) authentication.getPrincipal();
		model.addAttribute("cu", u);
		return "welcome";
	}

}
