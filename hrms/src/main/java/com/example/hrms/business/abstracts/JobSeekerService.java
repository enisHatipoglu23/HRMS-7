package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.core.utilities.DataResult;
import com.example.hrms.core.utilities.Result;

import com.example.hrms.entities.JobSeeker;

public interface JobSeekerService {

			DataResult<JobSeeker> getJobSeekerByNationalityNumber(String nationalityNumber);
			DataResult<JobSeeker> getJobSeekerByEmail(String email);

	
			DataResult<List<JobSeeker>> getAll();
			
			Result add(JobSeeker jobSeeker);
			Result update(JobSeeker jobSeeker);
			Result delete(JobSeeker jobSeeker);
			

}
