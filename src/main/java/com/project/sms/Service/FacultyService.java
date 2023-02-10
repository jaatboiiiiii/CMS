package com.project.sms.Service;

import java.util.List;

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
		return repository.findById(id).get();
	}
	public void saveOrUpdate(Faculty faculty) {
		repository.save(faculty);
	}
	public void delete(String id) {
		repository.deleteById(id);
	}
	public List<Faculty> getdesig(String designation) {
		return repository.findByDesignation(designation);
	}
}
