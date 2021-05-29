package com.example.hrms.business.abstracts;

import com.example.hrms.core.utilities.Result;
import com.example.hrms.entities.Employer;
import com.example.hrms.entities.JobSeeker;

public interface AuthService {

	Result registerEmployer(Employer employer);
	Result registerJobSeeker(JobSeeker jobSeeker);
	
}
