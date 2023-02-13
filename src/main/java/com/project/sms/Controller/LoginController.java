package com.project.sms.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.sms.Service.AdminService;
import com.project.sms.Service.FacultyService;
import com.project.sms.Service.StudentService;
import com.project.sms.bean.User;

@RestController
@CrossOrigin
public class LoginController {
	
	@Autowired
	private StudentService studentService;
	@Autowired
	private FacultyService facultyService;
	@Autowired
	private AdminService adminService;

//	@PostMapping("/signup")
//	public boolean signUpHandler(@RequestBody User user)
//	{
//		return service.signup(user);
//		
//	}
	@PostMapping("/login")
	public Object loginHandler(@RequestBody User user) {
		String role = user.getRole();
		String email = user.getEmail();
		String password = user.getPassword();
		if (role.equals("admin")) {
			return adminService.authenticate(email,password);
		} else if(role.equals("student")){
			return studentService.authenticate(email,password);
		} else {
			return facultyService.authenticate(email,password);
		}

	}

}
