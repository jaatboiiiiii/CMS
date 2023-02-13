package com.project.sms.Service;

import org.springframework.stereotype.Service;

import com.project.sms.bean.Admin;

// Only for Admin email and Password
@Service
public class AdminService {
	
	public Admin authenticate(String email,String password)
	{
		boolean isValidEmail =email.equals("admin@gmail.com");
		boolean isValidPassword =password.equals("admin");
		if(isValidEmail && isValidPassword) {
			return new Admin(email,password);
		} else {
			return null;
		}
	}

}
