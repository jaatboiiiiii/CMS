package com.project.sms.bean;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Document("faculty")
public class Faculty{
	@Id
	@GeneratedValue
	private String id;
	@Size(min=3)
	private String facultyName;
	private List<String> courseId;
	@NotEmpty
	private String highestEducation;
	private String gender;
	@NotEmpty
	private String designation;
	@GeneratedValue
	private String password;
	@Email
	private String email;
	private String branch;
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Faculty(String id, String facultyName, List<String> courseId, String highestEducation, String gender,
			String designation, String password, String email, String branch) {
		super();
		this.id = id;
		this.facultyName = facultyName;
		this.courseId = courseId;
		this.highestEducation = highestEducation;
		this.gender = gender;
		this.designation = designation;
		this.password = password;
		this.email = email;
		this.branch = branch;
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

	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getdesignation() {
		return designation;
	}

	public void setdesignation(String designation) {
		this.designation = designation;
	}

	public String getid() {
		return id;
	}

	public void setid(String id) {
		this.id = id;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public List<String> getcourseId() {
		return courseId;
	}

	public void setcourseId(List<String> courseId) {
		this.courseId = courseId;
	}

	public String getHighestEducation() {
		return highestEducation;
	}

	public void setHighestEducation(String highestEducation) {
		this.highestEducation = highestEducation;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Faculty [id=" + id + ", facultyName=" + facultyName + ", courseId=" + courseId + ", highestEducation="
				+ highestEducation + ", gender=" + gender + ", designation=" + designation + ", password=" + password
				+ ", email=" + email + ", branch=" + branch + "]";
	}

	
}
