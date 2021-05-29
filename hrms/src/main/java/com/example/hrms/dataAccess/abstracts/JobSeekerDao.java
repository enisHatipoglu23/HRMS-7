package com.example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entities.JobSeeker;

public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer>{
	
			JobSeeker findByNationalityNumber(String nationalityNumber);
			JobSeeker findByEmail(String email);
			
}
