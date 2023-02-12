package com.project.sms.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import com.project.sms.Service.UserService;
import com.project.sms.bean.Admin;
import com.project.sms.bean.User;

@RestController
public class LoginController {
	@Autowired
	private Admin auth;
	
	@Autowired
	private UserService service;
	
//	@PostMapping("/signup")
//	public boolean signUpHandler(@RequestBody User user)
//	{
//		return service.signup(user);
//		
//	}
	@PostMapping("/login")
	public boolean loginHandler(@RequestBody User user)
	{
		String role =user.getRole();
		if(role.equals("Admin"))
		{
			 return auth.authenticate(user);
					 
		}
		else
		{
			return service.login(user);
		}
	
	}

}
