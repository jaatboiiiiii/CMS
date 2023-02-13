package com.project.sms.bean;

import java.util.Set;


public class Branch implements Comparable<Branch> {
	private String name;
	private int countOfSeats;
	private String hod;
	Set<String> facultyName;
	public Branch(String name, int countOfSeats, String hod, Set<String> facultyName) {
		super();
		this.name = name;
		this.countOfSeats = countOfSeats;
		this.hod = hod;
		this.facultyName = facultyName;
	}
	public Branch() {
		super();
	}
	public int compareTo(Branch other) {
		return name.compareTo(other.getName());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCountOfSeats() {
		return countOfSeats;
	}
	public void setCountOfSeats(int countOfSeats) {
		this.countOfSeats = countOfSeats;
	}
	public String getHod() {
		return hod;
	}
	public void setHod(String hod) {
		this.hod = hod;
	}
	public Set<String> getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(Set<String> facultyName) {
		this.facultyName = facultyName;
	}
	@Override
	public String toString() {
		return "Branch [name=" + name + ", countOfSeats=" + countOfSeats + ", hod=" + hod + ", facultyName="
				+ facultyName + "]";
	}
	
	
	
}
