package com.gcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.gcu.entity.ProductEntity;
import com.gcu.service.ProductService;

@Controller
public class ProductController {
	
	private ProductService productService;

	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	// handler method to handle list students and return mode and view
	@GetMapping("/products")
	public String listStudents(Model model) {
		model.addAttribute("products", productService.getAllStudents());
		return "products";
	}
	
	@GetMapping("/products/new")
	public String createProductForm(Model model) {
		
		// create student object to hold student form data
		ProductEntity product = new ProductEntity();
		model.addAttribute("product", product);
		return "create_products";
		
	}
	
	@PostMapping("/products")
	public String saveProduct(@ModelAttribute("product") ProductEntity product) {
		productService.saveProduct(product);
		return "redirect:/products";
	}
	
	@GetMapping("/products/edit/{id}")
	public String editProductForm(@PathVariable Long id, Model model) {
		model.addAttribute("product", productService.getProductById(id));
		return "edit_products";
	}

	@PostMapping("/products/{id}")
	public String updateProduct(@PathVariable Long id,
			@ModelAttribute("product") ProductEntity product,
			Model model) {
		
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
	
	@GetMapping("/products/{id}")
	public String deleteProduct(@PathVariable Long id) {
		productService.deleteProductById(id);
		return "redirect:/products";
	}
	
}
