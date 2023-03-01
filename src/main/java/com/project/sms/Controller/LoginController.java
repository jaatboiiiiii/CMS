package com.project.sms.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.sms.Service.AdminService;
import com.project.sms.Service.FacultyService;
import com.project.sms.Service.StudentService;
import com.project.sms.bean.User;
import com.project.sms.exception.AuthorizationFailedException;

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
	public ResponseEntity loginHandler(@RequestBody User user) {
		String role = user.getRole();
		String email = user.getEmail();
		String password = user.getPassword();
		Object obj;
		if (role.equals("admin")) {
			obj = adminService.authenticate(email, password);
			System.out.println(obj);
			if (obj == null)
				throw new AuthorizationFailedException();
			return new ResponseEntity<>(obj,HttpStatus.ACCEPTED);
		} else if (role.equals("student")) {
			obj = studentService.authenticate(email, password);
			if (obj == null)
				throw new AuthorizationFailedException();
			return new ResponseEntity<>(obj,HttpStatus.ACCEPTED);
		} else {
			obj = facultyService.authenticate(email, password);
			if (obj == null)
				throw new AuthorizationFailedException();
			return new ResponseEntity<>(obj,HttpStatus.ACCEPTED);
		}

	}

}
