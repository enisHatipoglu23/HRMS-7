package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.JobPositionsService;
import com.example.hrms.core.Messages;
import com.example.hrms.core.utilities.DataResult;
import com.example.hrms.core.utilities.ErrorResult;
import com.example.hrms.core.utilities.Result;
import com.example.hrms.core.utilities.SuccessDataResult;
import com.example.hrms.core.utilities.SuccessResult;
import com.example.hrms.dataAccess.abstracts.JobPositionsDao;
import com.example.hrms.entities.JobPositions;

@Service
public class JobPositionsManager implements JobPositionsService{

	private JobPositionsDao jobPositionsDao;
	
	
	@Autowired
	public JobPositionsManager(JobPositionsDao jobPositionsDao) {
		
		super();
		this.jobPositionsDao = jobPositionsDao;
	
	}
	
	@Override
	public DataResult<List<JobPositions>> getAll() {

		return new SuccessDataResult<List<JobPositions>>
		(this.jobPositionsDao.findAll(), Messages.JOB_POITION_LISTED);
	}

	
	@Override
	public DataResult<JobPositions> getByJobPosition(String job) {
		
		return new SuccessDataResult<JobPositions>(this.jobPositionsDao.findByJob(job));
	}
	
	
	@Override
	public Result add(JobPositions jobPositions) {
		if(getByJobPosition(jobPositions.getJob()).getData() != null) {
			return new ErrorResult(Messages.JOB_POSITION_EXIST);
		
		}
		this.jobPositionsDao.save(jobPositions);
		return new SuccessResult(Messages.JOB_POSITION_ADDED);
	}

	@Override
	public Result update(JobPositions jobPositions) {
		
		return new SuccessResult(Messages.JOB_POSITION_UPDATED);
	}

	@Override
	public Result delete(JobPositions jobPositions) {
		
		return new SuccessResult(Messages.JOB_POSITION_DELETED);
	}

	



	

	
	
}
