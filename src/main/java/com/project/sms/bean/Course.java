package com.project.sms.bean;

import java.util.List;

import org.springframework.data.annotation.Id;

//import java.lang.annotation.Documented;

import org.springframework.data.mongodb.core.mapping.Document;
@Document("CourseData")  
public class Course {
 @Id
 private String courseId;
 private String courseName;
 private String branchName;
// private String courseId;
// private int countOfSeats;
// private String faclutyName;
 private List<String> facultyId;


public Course() {
	super();
//	 TODO Auto-generated constructor stub
}


public Course(String courseId, String courseName, String branchName, List<String> facultyId) {
	super();
	this.courseId = courseId;
	this.courseName = courseName;
	this.branchName = branchName;
	this.facultyId = facultyId;
}


public String getCourseId() {
	return courseId;
}


public void setCourseId(String courseId) {
	this.courseId = courseId;
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