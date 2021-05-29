package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.EmployerService;
import com.example.hrms.core.utilities.DataResult;
import com.example.hrms.core.utilities.Result;
import com.example.hrms.entities.Employer;

@RestController
@RequestMapping("/api/employers")
public class EmployerController {

	private EmployerService employerService;
	
	@Autowired
	public EmployerController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employer>> getAll(){
		return this.employerService.getAll();
		
	}
	@PostMapping("/add")
	public Result add(@RequestBody Employer employer)	{
		
		return this.employerService.add(employer);
	
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody Employer employer)	{
		
		return this.employerService.update(employer);
	
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestBody Employer employer)	{
		
		return this.employerService.delete(employer);
	
	}
	
	
}
