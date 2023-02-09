package com.project.sms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.sms.bean.Course;
@Repository
public interface CourseRepository extends MongoRepository<Course, String> {
	
}
