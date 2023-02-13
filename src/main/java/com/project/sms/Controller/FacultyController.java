package com.project.sms.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.sms.bean.Faculty;
import com.project.sms.Service.FacultyService;

@RestController
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
	public void saveStudent(@RequestBody Faculty faculty) {
		service.add(faculty);
	}
	@PutMapping("/faculty/{id}")
	public void updateStudent(@PathVariable String id,@RequestBody Faculty faculty) {
		service.update(id,faculty);
	}
	@GetMapping("/faculty-des/{designation}")
	public List<Faculty> getHod(@PathVariable String designation){
		return service.getdesig(designation);
	}
}
	