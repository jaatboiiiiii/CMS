package com.project.sms.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.sms.bean.Faculty;

@Repository
public interface FacultyRepository extends MongoRepository<Faculty, String>{

	List<Faculty> findByDesignation(String designation);
	Faculty findByEmail(String email);

}
