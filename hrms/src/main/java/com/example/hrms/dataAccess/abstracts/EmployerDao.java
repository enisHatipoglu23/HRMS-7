package com.example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entities.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer>{

	Employer emailVerification(String email);
	Employer activation(boolean activate);
	
	Employer findByEmail(String email);
}
