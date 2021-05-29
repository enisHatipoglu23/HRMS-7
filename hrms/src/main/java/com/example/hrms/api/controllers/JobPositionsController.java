package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.JobPositionsService;
import com.example.hrms.core.utilities.DataResult;
import com.example.hrms.core.utilities.Result;
import com.example.hrms.entities.JobPositions;


@RestController
@RequestMapping("/api/JobPositions")
public class JobPositionsController {

	private JobPositionsService jobPositionsService;

	
	@Autowired
	public JobPositionsController(JobPositionsService jobPositionsService) {
		super();
		this.jobPositionsService = jobPositionsService;
	}
	
	
	@GetMapping("/getall")
	public DataResult<List<JobPositions>> getAll(){
		
		return this.jobPositionsService.getAll();
		
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobPositions jobPositions)	{
		
		return this.jobPositionsService.add(jobPositions);
	
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody JobPositions jobPositions)	{
		
		return this.jobPositionsService.update(jobPositions);
	
	}	
	
	@PostMapping("/delete")
	public Result delete(@RequestBody JobPositions jobPositions)	{
		
		return this.jobPositionsService.delete(jobPositions);
	
	}	
	
	
	
}
