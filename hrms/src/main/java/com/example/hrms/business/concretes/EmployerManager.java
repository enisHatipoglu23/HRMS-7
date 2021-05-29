package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.EmployerService;
import com.example.hrms.core.Messages;
import com.example.hrms.core.utilities.DataResult;
import com.example.hrms.core.utilities.Result;
import com.example.hrms.core.utilities.SuccessDataResult;
import com.example.hrms.core.utilities.SuccessResult;
import com.example.hrms.dataAccess.abstracts.EmployerDao;
import com.example.hrms.entities.Employer;

@Service
public class EmployerManager implements EmployerService{

	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "Done. ");
		
	}

	@Override
	public Result add(Employer employer) {
		
		this.employerDao.save(employer);
		return new SuccessResult(Messages.EMPLOYER_ADDED);
	}

	@Override
	public Result update(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessResult(Messages.EMPLOYER_UPDATED);
	}

	@Override
	public Result delete(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessResult(Messages.EMPLOYER_DELETED  );
	}

	@Override
	public DataResult<Employer> getEmployerByEmail(String email) {
		return new SuccessDataResult<Employer>(this.employerDao.findByEmail(email));
	}

	
	
}
