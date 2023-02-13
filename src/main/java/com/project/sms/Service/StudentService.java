package com.project.sms.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.sms.bean.Student;
import com.project.sms.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repository;
	
	public List<Student> findAll() {
		return repository.findAll();
	}
	
	public Student findById(String id) {
		return repository.findById(id).orElse(null);
	}
	
	public void delete(String id) {
		repository.deleteById(id);
	}
	public void update(String id,Student newStudent) {
		delete(id);
		newStudent.setId(id);
		add(newStudent);
	}
	
	public void add(Student student) {
		repository.save(student);
	}
	
	public Set<String> findAllBranch() {
		return repository.findAll().stream().map(s -> s.getStudentBranch()).collect(Collectors.toSet());
	}
	
	public Student authenticate(String email,String password) // accept only email, password and role from user
	{
		Student student = repository.findByEmail(email);
		if (student != null) {
			boolean isValidemail = email.equals(student.getEmail());
			boolean isValidpassword = password.equals(student.getPassword());
			if(isValidemail && isValidpassword)
				return student;
			else
				return null;
		} else
			return null;

	}
	
}
