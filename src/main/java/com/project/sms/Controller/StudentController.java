package com.project.sms.Controller;

import java.util.List;
import java.util.Set;

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

import com.project.sms.Service.StudentService;
import com.project.sms.bean.Student;
import com.project.sms.exception.MethodArgumentMismatchException;
import com.project.sms.exception.UserAlreadyExistsException;

import jakarta.validation.Valid;

@RestController
@CrossOrigin
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		return studentService.findAll();
	}
	
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable("id") String id) {
		return studentService.findById(id);
	}
	
	@PutMapping("/students/{id}")
	public ResponseEntity updateStudent(@PathVariable String id,@RequestBody Student student, BindingResult result) {
		if(result.hasErrors())
			throw new MethodArgumentMismatchException();
		studentService.update(id,student);
		return new ResponseEntity<>("Student added",HttpStatus.OK);
	}
	
	@DeleteMapping("/students/{id}")
	public List<Student> deleteStudent(@PathVariable String id) {
		studentService.delete(id);
		return studentService.findAll();
	}
	
	@PostMapping("/students")
	public ResponseEntity addStudent(@RequestBody @Valid Student student, BindingResult result) {
		if(result.hasErrors())
			throw new MethodArgumentMismatchException();
		if(studentService.findByEmail(student.getEmail()) != null)
			throw new UserAlreadyExistsException();
		studentService.add(student);
		return new ResponseEntity<>("Student added",HttpStatus.OK);
	}
	
	@GetMapping("/students/branch")
	public Set<String> getAllBranch() {
		return studentService.findAllBranch();
	}
	
//	@GetMapping("/students/{id}/courses")
//	public List<Course> getCoursesById(@PathVariable String id){
//		Student student = studentService.findById(id);
//		return courseService.findCourse(student.getStudentBranch(),student.getStudentYear());
//	}
	
//	public 
}
