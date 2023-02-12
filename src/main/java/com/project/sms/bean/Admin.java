package com.project.sms.bean;

import org.springframework.stereotype.Service;
// Only for Admin email and Password
@Service
public class Admin {
	
	public boolean authenticate(User user)
	{
	    String email =user.getEmail();
	    String password =user.getPassword();
	    
		boolean isValid =email.equals("admin@gmail.com");
		boolean isValidpassword =password.equals("admin");
		return isValid && isValidpassword;
	}

}
