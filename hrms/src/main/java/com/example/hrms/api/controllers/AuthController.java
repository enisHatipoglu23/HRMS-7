package com.example.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.AuthService;
import com.example.hrms.core.utilities.Result;
import com.example.hrms.entities.Employer;
import com.example.hrms.entities.JobSeeker;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

	private AuthService authService;

	@Autowired
	public AuthController(AuthService authService) {
		super();
		this.authService = authService;
	}
	
	@PostMapping("/registeremployer")
	public Result registerEmployer(@RequestBody Employer employer) {
		
		return authService.registerEmployer(employer);
	}
	
	@PostMapping("/registerjobseeker")
	public Result registerJobSeeker(@RequestBody JobSeeker jobSeeker) {
		
		return authService.registerJobSeeker(jobSeeker);
		
	}
	
		
	
}
