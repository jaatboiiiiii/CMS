package com.project.sms.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.sms.bean.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
	Student findByEmail(String email);
}
