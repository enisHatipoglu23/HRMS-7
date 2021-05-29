package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.PersonnelService;
import com.example.hrms.core.Messages;
import com.example.hrms.core.utilities.DataResult;
import com.example.hrms.core.utilities.Result;
import com.example.hrms.core.utilities.SuccessDataResult;
import com.example.hrms.core.utilities.SuccessResult;
import com.example.hrms.dataAccess.abstracts.PersonnelDao;
import com.example.hrms.entities.Personnel;

@Service
public class PersonnelManager implements PersonnelService{

	private PersonnelDao personnelDao;
	
	@Autowired
	public PersonnelManager(PersonnelDao personnelDao) {
		this.personnelDao = personnelDao;
	}

	@Override
	public DataResult<List<Personnel>> getAll() {
		
		return new SuccessDataResult<List<Personnel>>(this.personnelDao.findAll(), "Done. ");
	}

	@Override
	public Result add(Personnel personnel) {
		this.personnelDao.save(personnel);
		return new SuccessResult(Messages.PERSONNEL_LISTED);
	}
	
	
	
}
