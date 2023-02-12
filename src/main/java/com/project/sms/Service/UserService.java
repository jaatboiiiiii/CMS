package com.project.sms.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.sms.bean.User;
import com.project.sms.repository.UserRepository;


@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;

	//use signup function in case you want signup from outside by faculty and student
	
//	public boolean signup(User user) 
//	{
//		//String email=user.getEmail();
//		User s2 =repository.findByEmail(user.getEmail());
//		if(s2!=null)
//		{
//		 if(user.getEmail().equals(s2.getEmail()))
//		 {
//            return false;
//		 }
//		}
//		else 
//		{
//			repository.save(user);
//			return true;
//		}
//		return false;
//	}


	public boolean login(User user) //accept only email, password and role from user
	{
		String email =user.getEmail();
		String password =user.getPassword();
		String role =user.getRole();
		
		User s1 = repository.findByEmail(email);
		if(s1!=null)
		{
		boolean isValidemail =email.equals(s1.getEmail());
		boolean isValidpassword =password.equals(s1.getPassword());
		boolean isValidrole =role.equals(s1.getRole());
		
		return isValidemail && isValidpassword && isValidrole;
		}
		else
			return false;
		
	}

}
