package com.project.sms.bean;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public class Admin {
	@Email
	private String email;
	@NotEmpty
	private String password;
	public Admin(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public Admin() {
		super();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [email=" + email + ", password=" + password + "]";
	}
	
}
