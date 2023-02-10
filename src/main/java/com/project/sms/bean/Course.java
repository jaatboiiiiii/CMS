package com.project.sms.bean;

import java.util.List;

import org.springframework.data.annotation.Id;

//import java.lang.annotation.Documented;

import org.springframework.data.mongodb.core.mapping.Document;
@Document("courseData")  
public class Course {
 @Id
 private String Id;
 private String courseName;
 private String branchName;
// private String Id;
// private int countOfSeats;
// private String faclutyName;
 private String syllabus;
 private List<String> facultyId;
 public String getSyllabus() {
	return syllabus;
}


public void setSyllabus(String syllabus) {
	this.syllabus = syllabus;
}





public Course() {
	super();
//	 TODO Auto-generated constructor stub
}





public String getId() {
	return Id;
}


public void setId(String Id) {
	this.Id = Id;
}


public String getCourseName() {
	return courseName;
}


public void setCourseName(String courseName) {
	this.courseName = courseName;
}


public String getBranchName() {
	return branchName;
}


public void setBranchName(String branchName) {
	this.branchName = branchName;
}


public List<String> getFacultyId() {
	return facultyId;
}


public void setFacultyId(List<String> facultyId) {
	this.facultyId = facultyId;
}

}