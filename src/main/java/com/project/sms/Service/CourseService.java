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
		return repository.findById(courseId).get();
	}

	public void add(Course course) {
		repository.save(course);
		// TODO Auto-generated method stub
		
	}

	public void remove(String courseId) {
		Course c = repository.findById(courseId).get();
		repository.delete(c);
		// TODO Auto-generated method stub
		
	}

	public void update(String courseId, Course course) {
			Course c=repository.findById(courseId).get();

			c.setCourseId(course.getCourseId());
			c.setBranchName(course.getBranchName());
//			c.setCountOfSeats(course.getCountOfSeats());
			c.setCourseName(course.getCourseName());
//			c.setFaclutyName(course.getFaclutyName());
			c.setFacultyId(course.getFacultyId());
			repository.save(c);
		
	}
	
}
