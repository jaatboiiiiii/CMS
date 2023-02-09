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

	public Course findCourse(String courseName) {
		return repository.findById(courseName).get();
	}

	public void add(Course course) {
		repository.save(course);
		// TODO Auto-generated method stub
		
	}

	public void remove(String courseName) {
		Course c = repository.findById(courseName).get();
		repository.delete(c);
		// TODO Auto-generated method stub
		
	}

	public void update(String courseName, Course course) {
			Course c=repository.findById(courseName).get();
			c.setBranchName(course.getBranchName());
			c.setCountOfSeats(course.getCountOfSeats());
			c.setCourseName(course.getCourseName());
			c.setFaclutyName(course.getFaclutyName());
			c.setHodName(course.getHodName());
			repository.save(c);
		
	}
	
}
