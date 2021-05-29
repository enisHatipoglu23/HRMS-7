package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.core.utilities.DataResult;
import com.example.hrms.core.utilities.Result;
import com.example.hrms.entities.Personnel;

public interface PersonnelService {

	DataResult<List<Personnel>> getAll();
	Result add(Personnel personnel);
	
}
