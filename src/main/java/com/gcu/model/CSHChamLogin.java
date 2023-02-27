/**
 * 
 */
package com.gcu.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CSHChamLogin {
	
	@NotNull(message="User name is a required field")
	@Size(min=1, max=15, message="User name must be between 1 and 15 characters")
	private String username;
	
	@NotNull(message="Password is a required field")
	@Size(min=1, max=15, message="Password must be between 1 and 15 characters")
	private String password;
	
	
	
	/**
	 * @param username
	 * @param password
	 */
	public CSHChamLogin(
			@NotNull(message = "User name is a required field") @Size(min = 1, max = 32, message = "User name must be between 1 and 32 characters") String username,
			@NotNull(message = "Password is a required field") @Size(min = 1, max = 32, message = "Password must be between 1 and 32 characters") String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	
	/**
	 * 
	 */
	public CSHChamLogin() {
		super();
	}


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


	@Override
	public String toString() {
		return "CSHChamLogin [username=" + username + ", password=" + password + "]";
	}

	

}
