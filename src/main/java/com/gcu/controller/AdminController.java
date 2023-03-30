package com.gcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.entity.ProductEntity;
import com.gcu.entity.UserEntity;
import com.gcu.service.ProductService;
import com.gcu.service.UserService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	private ProductService productService;

	private UserService userService;

	public AdminController(UserService userService, ProductService productService) {
		super();
		this.userService = userService;
		this.productService = productService;
	}

	@GetMapping("/products/new")
	public String createProductForm(Model model) {

		// create student object to hold student form data
		ProductEntity product = new ProductEntity();
		model.addAttribute("product", product);
		return "create_products";

	}

	@GetMapping("/users/new")
	public String createUserForm(Model model) {

		// create student object to hold student form data
		UserEntity userEntity = new UserEntity();
		model.addAttribute("user", userEntity);
		return "create_user";

	}

	@GetMapping("/products/{id}")
	public String deleteProduct(@PathVariable Long id) {
		productService.deleteProductById(id);
		return "redirect:/products";
	}

	@GetMapping("/users/{id}")
	public String deleteUser(@PathVariable Long id) {
		userService.deleteUserById(id);
		return "redirect:/users";
	}

	@GetMapping("/products/edit/{id}")
	public String editProductForm(@PathVariable Long id, Model model) {
		model.addAttribute("product", productService.getProductById(id));
		return "edit_products";
	}

	@GetMapping("/users/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("user", userService.getUserById(id));
		return "edit_user";
	}

	// handler method to handle delete student request

	@GetMapping("/")
	public String listStudents(Model model) {
		model.addAttribute("products", productService.getAllStudents());
		return "products";
	}

	// handler method to handle list students and return mode and view
	@GetMapping("users")
	public String listUsers(Model model) {
		model.addAttribute("users", userService.getAllStudents());
		return "users";
	}

	@PostMapping("/products")
	public String saveProduct(@ModelAttribute("product") ProductEntity product) {
		productService.saveProduct(product);
		return "redirect:/products";
	}

	@PostMapping("/users")
	public String saveUser(@ModelAttribute("user") UserEntity userEntity) {
		userService.saveUser(userEntity);
		return "redirect:/users";
	}

	@PostMapping("/products/{id}")
	public String updateProduct(@PathVariable Long id, @ModelAttribute("product") ProductEntity product, Model model) {

		// get student from database by id
		ProductEntity existingStudent = productService.getProductById(id);
		existingStudent.setId(id);
		existingStudent.setName(product.getName());
		existingStudent.setDescription(product.getDescription());
		existingStudent.setQuantity(product.getQuantity());
		existingStudent.setPrice(product.getPrice());

		// save updated student object
		productService.updateProduct(existingStudent);
		return "redirect:/products";
	}

	// handler method to handle delete student request

	@PostMapping("/users/{id}")
	public String updateUser(@PathVariable Long id, @ModelAttribute("user") UserEntity userEntity, Model model) {

		// get student from database by id
		UserEntity existingStudent = userService.getUserById(id);
		existingStudent.setId(id);
		existingStudent.setFirstName(userEntity.getFirstName());
		existingStudent.setLastName(userEntity.getLastName());
		existingStudent.setEmail(userEntity.getEmail());
		existingStudent.setPassword(userEntity.getPassword());

		// save updated student object
		userService.updateUser(existingStudent);
		return "redirect:/users";
	}

}