package com.project.sms.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.sms.bean.Faculty;
import com.project.sms.exception.MethodArgumentMismatchException;
import com.project.sms.exception.UserAlreadyExistsException;
import com.project.sms.Service.FacultyService;

@RestController
@CrossOrigin
public class FacultyController {
	@Autowired
	FacultyService service;
	
	@GetMapping("/faculty")
	public List<Faculty> getAll() {
		return service.getAllFaculty();
	}
	@GetMapping("/faculty/{id}")
	public Faculty getById(@PathVariable String id) {
		return service.getFacultyById(id);
	}
	@DeleteMapping("/faculty/{id}")
	public void deleteFaculty(@PathVariable String id) {
		service.delete(id);
	}
	@PostMapping("/faculty")
	public  ResponseEntity saveFaculty(@RequestBody Faculty faculty) {
		if(service.getFacultyByEmail(faculty.getEmail()) != null)
			throw new UserAlreadyExistsException();
		service.add(faculty);
		return new ResponseEntity<>("Faculty Added",HttpStatus.OK);
	}
	@PutMapping("/faculty/{id}")
	public ResponseEntity updateFaculty(@PathVariable String id,@RequestBody Faculty faculty, BindingResult result) {
		if(result.hasErrors())
			throw new MethodArgumentMismatchException();
		service.update(id,faculty);
		return new ResponseEntity<>("Faculty Added",HttpStatus.OK);
	}
	@GetMapping("/faculty/{designation}")
	public List<Faculty> getHod(@PathVariable String designation){
		return service.getdesig(designation);
	}
}
	