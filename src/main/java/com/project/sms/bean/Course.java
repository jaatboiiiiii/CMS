package com.project.sms.bean;

import org.springframework.data.annotation.Id;

//import java.lang.annotation.Documented;

import org.springframework.data.mongodb.core.mapping.Document;
@Document("courseDetails")  
public class Course {
 @Id
 
 private String courseName;
 private String branchName;
 private String hodName;
 private int countOfSeats;
 private String faclutyName;


public Course() {
	super();
//	 TODO Auto-generated constructor stub
}
public Course(String courseName, String branchName, String hodName, int countOfSeats, String faclutyName) {
	super();
	this.courseName = courseName;
	this.branchName = branchName;
	this.hodName = hodName;
	this.countOfSeats = countOfSeats;
	this.faclutyName = faclutyName;
}
@Override
public String toString() {
	return "Course [courseName=" + courseName + ", branchName=" + branchName + ", hodName=" + hodName
			+ ", countOfSeats=" + countOfSeats + ", faclutyName=" + faclutyName + "]";
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
public String getHodName() {
	return hodName;
}
public void setHodName(String hodName) {
	this.hodName = hodName;
}
public int getCountOfSeats() {
	return countOfSeats;
}
public void setCountOfSeats(int countOfSeats) {
	this.countOfSeats = countOfSeats;
}
public String getFaclutyName() {
	return faclutyName;
}
public void setFaclutyName(String faclutyName) {
	this.faclutyName = faclutyName;
}
}
