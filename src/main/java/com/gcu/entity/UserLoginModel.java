package com.gcu.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserLoginModel {
	@NotNull(message="User name is a required field")
	@Size(min=1, max=15, message="User name must be between 1 and 15 characters")
	private String username;
	
	@NotNull(message="Password is a required field")
	@Size(min=1, max=15, message="Password must be between 1 and 15 characters")
	private String password;
	
	

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

	public UserLoginModel(
			@NotNull(message = "User name is a required field") @Size(min = 1, max = 15, message = "User name must be between 1 and 15 characters") String username,
			@NotNull(message = "Password is a required field") @Size(min = 1, max = 15, message = "Password must be between 1 and 15 characters") String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public UserLoginModel() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserLoginModel [username=" + username + ", password=" + password + "]";
	}
	

	
}
