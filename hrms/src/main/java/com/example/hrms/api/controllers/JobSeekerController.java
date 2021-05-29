package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.JobSeekerService;
import com.example.hrms.core.utilities.DataResult;
import com.example.hrms.core.utilities.Result;
import com.example.hrms.entities.JobSeeker;

@RestController
@RequestMapping("/api/jobseekers")
public class JobSeekerController {

			private JobSeekerService jobSeekerService;
			
			@Autowired
			public JobSeekerController(JobSeekerService jobSeekerService) {
				
				super();
				this.jobSeekerService = jobSeekerService;
				
			}
			
			public DataResult<List<JobSeeker>> getAll(){
				
				return this.jobSeekerService.getAll();
				
			}
			
			@PostMapping("/add")
			public Result add(@RequestBody JobSeeker jobSeeker)	{
				
				return this.jobSeekerService.add(jobSeeker);
			
			}
			
			@PostMapping("/update")
			public Result update(@RequestBody JobSeeker jobSeeker)	{
				
				return this.jobSeekerService.update(jobSeeker);
			
			}	
			
			@PostMapping("/delete")
			public Result delete(@RequestBody JobSeeker jobSeeker)	{
				
				return this.jobSeekerService.delete(jobSeeker);
			
			}	
	
}
