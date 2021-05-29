package com.example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entities.JobPositions;

public interface JobPositionsDao extends JpaRepository<JobPositions, Integer>{

			JobPositions findByJob(String job);
			JobPositions getByJob(JobPositions jobPositions);
			String getByJob(String job);
	
}
