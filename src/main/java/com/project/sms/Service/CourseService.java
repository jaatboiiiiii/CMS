package com.project.sms.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.sms.bean.Course;
//import com.project.sms.Controller.Course;
import com.project.sms.repository.CourseRepository;

@Service
public class CourseService {
	@Autowired
	CourseRepository repository;

	public List<Course> findAll() {
		return repository.findAll();
	}

	public Course findCourse(String courseId) {
		return repository.findById(courseId).orElse(null);
	}

	public void add(Course course) {
		repository.save(course);
		// TODO Auto-generated method stub
	}

	public void remove(String courseId) {
		Course c = repository.findById(courseId).get();
		repository.delete(c);
	}

	public void update(String courseId, Course course) {
			remove(courseId);
			course.setId(courseId);
			repository.save(course);
		
	}
	
}
