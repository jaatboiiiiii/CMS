package com.project.sms.bean;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document("Faculty")
public class Faculty{
	@Id
	private String id;
	private String facultyName;
	private List<String> courseId;
	private String highestEducation;
	private String gender;
	private String designation;
	

	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Faculty(String id, String facultyName, List<String> courseId, String highestEducation, String gender, String designation) {
		super();
		this.id = id;
		this.facultyName = facultyName;
		this.courseId = courseId;
		this.highestEducation = highestEducation;
		this.gender = gender;
		this.designation = designation;
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
		return "Faculty [id=" + id + ", facultyName=" + facultyName + ", courseId=" + courseId
				+ ", highestEducation=" + highestEducation + ", gender=" + gender + "]";
	}

	
}
