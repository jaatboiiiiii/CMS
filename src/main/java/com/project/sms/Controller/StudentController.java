package com.project.sms.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

@RestController
@CrossOrigin
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		System.out.println(studentService.findAll());
		return studentService.findAll();
	}
	
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable("id") String id) {
		return studentService.findById(id);
	}
	
	@PutMapping("/students/{id}")
	public void updateStudent(@PathVariable String id,@RequestBody Student student) {
		studentService.update(id,student);
	}
	
	@DeleteMapping("/students/{id}")
	public List<Student> deleteStudent(@PathVariable String id) {
		studentService.delete(id);
		return studentService.findAll();
	}
	
	@PostMapping("/students")
	public void addStudent(@RequestBody Student student) {
		studentService.add(student);
	}
	
//	@GetMapping("/students/{id}/courses")
//	public List<Course> getCoursesById(@PathVariable String id){
//		Student student = studentService.findById(id);
//		return courseService.findCourse(student.getStudentBranch(),student.getStudentYear());
//	}
	
//	public 
}
