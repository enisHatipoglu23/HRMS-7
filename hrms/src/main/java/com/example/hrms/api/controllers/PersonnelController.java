package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.PersonnelService;
import com.example.hrms.core.utilities.DataResult;
import com.example.hrms.core.utilities.Result;
import com.example.hrms.entities.Personnel;


@RestController
@RequestMapping("/api/personnels")
public class PersonnelController {

	private PersonnelService personnelService;
	
	@Autowired
	public PersonnelController(PersonnelService personnelService) {
		this.personnelService = personnelService;
	}
	
	public DataResult<List<Personnel>> getAll(){
		return this.personnelService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Personnel personnel)	{
		
		return this.personnelService.add(personnel);
	
	}	
	
}
