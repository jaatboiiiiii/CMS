package com.project.sms.Controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.sms.Service.BranchService;
import com.project.sms.bean.Branch;

@RestController
public class BranchController {
	
	@Autowired
	private BranchService branchService;
	
	@GetMapping("/branch")
	public Set<Branch> findAll() {
		return branchService.getAll();
	}
}
