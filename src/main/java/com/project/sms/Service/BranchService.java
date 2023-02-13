package com.project.sms.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.sms.bean.Branch;

@Service
public class BranchService {
	@Autowired
	private StudentService studentService;
	@Autowired
	private CourseService courseService;
	@Autowired
	private FacultyService facultyService;
	
	public Set<Branch> getAll() {
		Set<Branch> branchList = new TreeSet<Branch>();
		Set<String> branchNames = studentService.findAllBranch();
		for(String branch : branchNames) {
			String hod = facultyService.findByHod(branch);
			int count = studentService.findAll().stream().filter(s -> s.getStudentBranch().equals(branch)).collect(Collectors.toSet()).size();
			Set<String> courseNames = courseService.findAll().stream().filter(c -> c.getBranchName().equals(branch)).map(c -> c.getCourseName()).collect(Collectors.toSet());
			branchList.add(new Branch(branch, count, hod, courseNames));
		}
		return branchList;
		
	}
}
