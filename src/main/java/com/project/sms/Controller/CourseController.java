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

import com.project.sms.Service.CourseService;
import com.project.sms.bean.Course;

@RestController
public class CourseController {
	@Autowired
	CourseService service;
	
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return service.findAll();
	}
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return service.findCourse(courseId);
	}
	@PostMapping("/courses")
	public void addCourse(@RequestBody Course course) {
		service.add(course);
		
	}
	@DeleteMapping("/courses/{courseId}")
	public void delete(@PathVariable String courseId) {
		service.remove(courseId);
	}
	@PutMapping("/courses/{courseId}")
	public void update(@PathVariable String courseId,@RequestBody Course course) {
		service.update(courseId,course);
	}
}
