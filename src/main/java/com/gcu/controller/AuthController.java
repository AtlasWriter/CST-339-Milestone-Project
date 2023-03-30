package com.gcu.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gcu.dto.LoginDto;
import com.gcu.dto.RegisterDto;
import com.gcu.entity.ProductEntity;
import com.gcu.entity.Role;
import com.gcu.entity.UserEntity;
import com.gcu.repository.RoleRepository;
import com.gcu.repository.UserRepository;
import com.gcu.service.ProductService;

@RestController
@RequestMapping("api/auth/")
public class AuthController {
 
	private AuthenticationManager authenticationManager;
	private PasswordEncoder passwordEncoder;
	private ProductService productService;
	private RoleRepository roleRepository;
	private UserRepository userRepository;

	@Autowired
	public AuthController(ProductService productService, AuthenticationManager authenticationManager,
			UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
		super();
		this.productService = productService;
		this.authenticationManager = authenticationManager;
		this.userRepository = userRepository;
		this.roleRepository = roleRepository;
		this.passwordEncoder = passwordEncoder;
	}

	@GetMapping("products/{id}")
	public ProductEntity getProduct(@PathVariable Long id) {
		return productService.getProductById(id);

	}

	@GetMapping("products")
	public List<ProductEntity> getProducts() {
		return productService.getAllStudents();
	}

	@PostMapping("login")
	public ResponseEntity<String> login(@RequestBody LoginDto loginDto) {
		Authentication authentication = authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(loginDto.getUsername(), loginDto.getPassword()));
		SecurityContextHolder.getContext().setAuthentication(authentication);
		return new ResponseEntity<>("User Signed Success", HttpStatus.OK);

	}

	@PostMapping("register/admin")
	public ResponseEntity<String> registerAdmin(@RequestBody RegisterDto registerDto) {
		if (userRepository.existsByUsername(registerDto.getUsername())) {
			return new ResponseEntity<>("Username is Taken", HttpStatus.BAD_REQUEST);

		}
		UserEntity user = new UserEntity();
		user.setUsername(registerDto.getUsername());
		user.setPassword(passwordEncoder.encode((registerDto.getPassword())));
		user.setFirstName(registerDto.getFirstName());
		user.setLastName(registerDto.getLastName());
		user.setEmail(registerDto.getEmail());

		// Repository end points and setting roles of new registration creating a user
		// entity setting roles for new user with a new object
		Role roles = roleRepository.findByName("ADMIN").get();
		user.setRoles(Collections.singletonList(roles));

		userRepository.save(user);

		return new ResponseEntity<>("User Registered success!", HttpStatus.OK);
	}

	@PostMapping("register/user")
	public ResponseEntity<String> registerUser(@RequestBody RegisterDto registerDto) {
		if (userRepository.existsByUsername(registerDto.getUsername())) {
			return new ResponseEntity<>("Username is Taken", HttpStatus.BAD_REQUEST);

		}
		UserEntity user = new UserEntity();
		user.setUsername(registerDto.getUsername());
		user.setPassword(passwordEncoder.encode((registerDto.getPassword())));
		user.setFirstName(registerDto.getFirstName());
		user.setLastName(registerDto.getLastName());
		user.setEmail(registerDto.getEmail());

		// Repository end points and setting roles of new registration creating a user
		// entity setting roles for new user with a new object
		Role roles = roleRepository.findByName("USER").get();
		user.setRoles(Collections.singletonList(roles));

		userRepository.save(user);

		return new ResponseEntity<>("User Registered success!", HttpStatus.OK);
	}

}
