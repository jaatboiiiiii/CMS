package com.project.sms.repository;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.sms.bean.User;



@Repository
public interface UserRepository  extends MongoRepository<User, String>{
	
	User findByEmail(String email);

	

	

}
