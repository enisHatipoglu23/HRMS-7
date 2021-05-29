package com.example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entities.Personnel;

public interface PersonnelDao extends JpaRepository<Personnel, Integer>{

}
