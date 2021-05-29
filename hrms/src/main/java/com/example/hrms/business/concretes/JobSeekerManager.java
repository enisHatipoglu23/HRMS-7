package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.JobSeekerService;
import com.example.hrms.core.Messages;
import com.example.hrms.core.utilities.DataResult;
import com.example.hrms.core.utilities.Result;
import com.example.hrms.core.utilities.SuccessDataResult;
import com.example.hrms.core.utilities.SuccessResult;
import com.example.hrms.dataAccess.abstracts.JobSeekerDao;
import com.example.hrms.entities.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService{

	private JobSeekerDao jobSeekerDao;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		
		super();
		this.jobSeekerDao = jobSeekerDao;
		
	}
	
	
	@Override
	public DataResult<List<JobSeeker>> getAll() {

		return new SuccessDataResult<List<JobSeeker>>
		(this.jobSeekerDao.findAll(), Messages.JOB_SEEKER_LISTED);
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		
		this.jobSeekerDao.save(jobSeeker);
		return new SuccessResult(Messages.JOB_SEEKER_ADDED);
	}


	@Override
	public DataResult<JobSeeker> getJobSeekerByNationalityNumber(String nationalityNumber) {
		return new SuccessDataResult<JobSeeker>(this.jobSeekerDao.findByNationalityNumber(nationalityNumber));
	}


	@Override
	public DataResult<JobSeeker> getJobSeekerByEmail(String email) {
		return new SuccessDataResult<JobSeeker>(this.jobSeekerDao.findByEmail(email));
	}


	@Override
	public Result update(JobSeeker jobSeeker) {
		this.jobSeekerDao.save(jobSeeker);
		return new SuccessResult(Messages.JOB_SEEKER_UPDATED);
	}


	@Override
	public Result delete(JobSeeker jobSeeker) {
		this.jobSeekerDao.save(jobSeeker);
		return new SuccessResult(Messages.JOB_SEEKER_DELETED);
	}

	
	
}
