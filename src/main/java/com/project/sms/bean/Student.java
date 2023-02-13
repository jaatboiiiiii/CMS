package com.project.sms.bean;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Document("Student")
public class Student {
	@Id
	@GeneratedValue
	private String id;
	private String studentName;
	private String studentBranch;
	private String studentGender;
	private String studentYear;
	private String email;
	private String password;
	public Student(String id, String studentName, String studentBranch, String studentGender, String studentYear,
			String email, String password) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.studentBranch = studentBranch;
		this.studentGender = studentGender;
		this.studentYear = studentYear;
		this.email = email;
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Student() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentBranch() {
		return studentBranch;
	}
	public void setStudentBranch(String studentBranch) {
		this.studentBranch = studentBranch;
	}
	public String getStudentGender() {
		return studentGender;
	}
	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}
	public String getStudentYear() {
		return studentYear;
	}
	public void setStudentYear(String studentYear) {
		this.studentYear = studentYear;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", studentBranch=" + studentBranch
				+ ", studentGender=" + studentGender + ", studentYear=" + studentYear + ", email=" + email
				+ ", password=" + password + "]";
	}
	
	
}
