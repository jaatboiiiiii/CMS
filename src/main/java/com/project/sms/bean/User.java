package com.project.sms.bean;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity(name="user")
public class User {
	@Id
	private String email;
	private String name;
	private String password;
	private String role;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String email, String name, String password, String role) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
		this.role = role;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", name=" + name + ", password=" + password + ", role=" + role + "]";
	}
	
}
