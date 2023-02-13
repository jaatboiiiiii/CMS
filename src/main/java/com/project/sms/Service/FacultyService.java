package com.project.sms.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.sms.bean.Faculty;
import com.project.sms.repository.FacultyRepository;

@Service
public class FacultyService {
	@Autowired
	private FacultyRepository repository;
	public List<Faculty> getAllFaculty() {
		return repository.findAll();
	}
	public Faculty getFacultyById(String id) {
		return repository.findById(id).orElse(null);
	}
	public void update(String id,Faculty faculty) {
		delete(id);
		faculty.setid(id);
		add(faculty);
	}
	public void add(Faculty faculty) {
		repository.save(faculty);
	}
	public void delete(String id) {
		repository.deleteById(id);
	}
	public List<Faculty> getdesig(String designation) {
		return repository.findByDesignation(designation);
	}
	
	public String findByHod(String branchName) {
		return repository.findAll().stream().filter(f -> f.getBranch().equals(branchName)).map(f -> f.getFacultyName()).findFirst().get();
	}
	
	public boolean authenticate(String email,String password) // accept only email, password and role from user
	{
		Faculty faculty = repository.findByEmail(email);
		if (faculty != null) {
			boolean isValidemail = email.equals(faculty.getEmail());
			boolean isValidpassword = password.equals(faculty.getPassword());
			return isValidemail && isValidpassword;
		} else
			return false;

	}
}
