package com.example.hrms.business.concretes;

import java.sql.Date;

import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.AuthService;
import com.example.hrms.business.abstracts.EmployerService;
import com.example.hrms.business.abstracts.JobSeekerService;
import com.example.hrms.core.Messages;
import com.example.hrms.core.adapters.abstracts.CheckService;
import com.example.hrms.core.utilities.ErrorResult;
import com.example.hrms.core.utilities.Result;
import com.example.hrms.core.utilities.SuccessResult;
import com.example.hrms.core.verification.VerificationService;
import com.example.hrms.entities.Employer;
import com.example.hrms.entities.JobSeeker;

@Service
public class AuthManager implements AuthService{

	private Employer employer;
	private JobSeeker jobSeeker;
	private EmployerService employerService;
	private JobSeekerService jobSeekerService;
	private CheckService checkService;
	private VerificationService verificationService;
	
	
	

	public AuthManager(Employer employer,
			JobSeeker jobSeeker,
			EmployerService employerService, 
			JobSeekerService jobSeekerService,
			VerificationService verificationService,
			CheckService checkService) {
		super();
		this.employer = employer;
		this.jobSeeker = jobSeeker;
		this.employerService = employerService;
		this.jobSeekerService = jobSeekerService;
		this.verificationService = verificationService;
		this.checkService = checkService;
		
	}

	
	//employer
	@Override
	public Result registerEmployer(Employer employer) {

		if(!checkIfNullValueInEmployer(employer)) {
			
			return new ErrorResult(Messages.EMPLOYER_NULL_ERROR);
			
		}
		
		if(!checkEqualEmailAndDomain(employer.getEmail(), employer.getWebsiteAdress())) {
			
			return new ErrorResult(Messages.EMPLOYER_EMAIL_ERROR);
			
		}
		
		if(!checkEmailExist(employer.getEmail())) {
			
			return new ErrorResult(Messages.EMPLOYER_EMAIL_EXIST_ERROR);
			
		}
		
		verificationService.sendEmail(employer.getEmail());
		employerService.add(employer);
		return new SuccessResult(Messages.EMPLOYER_REGISTIRATION_COMPLETED);
		
		
	
	}
	
	//employer
	
		private boolean checkIfNullValueInEmployer(Employer employer) {
			
			if(employer.getCompanyName() != null &&
					employer.getWebsiteAdress() != null&&
					employer.getEmail() != null&&
					employer.getPhoneNumber() != null&&
					employer.getPassword() != null)
				{
				return true;
				}
			return false;
			
			}
		
		private boolean checkEqualEmailAndDomain(String email, String webSiteAddress) {
			
			String[] emailArr = email.split("@", 2);
			String domain = webSiteAddress.substring(4, webSiteAddress.length());
			
			if(emailArr[1].equals(domain)) {
				return true;
		
			}
			
			return false;
			
		}
		
		private boolean checkEmailExist(String email) {
			
			if(this.employerService.getEmployerByEmail(email).getData() == null) {
					return true;
			}
		
			return false;
		
		}

	
	//jobSeeker
	@Override
	public Result registerJobSeeker(JobSeeker jobSeeker) {

		if(checkIfRealPerson(jobSeeker.getFirstName(), jobSeeker.getLastName(), jobSeeker.getNationalityNumber(), jobSeeker.getBirthDate()) == false) {
			
			return new ErrorResult(Messages.MERNIS_VERIFICATION_ERROR);
		}
		
		if(!checkNullValueInJobSeeker(jobSeeker)) {
			
			return new ErrorResult(Messages.JOB_SEEKER_NULL_ERROR);
			
		}
		
		if(!checkExistNationalityNumber(jobSeeker.getNationalityNumber())) {
			
			return new ErrorResult(Messages.JOB_SEEKER_NATIONALITY_NUMBER_ERROR);
		}
		
		if(!checkEmailExistInJobSeeker(jobSeeker.getEmail())) {
			
			return new ErrorResult(Messages.JOB_SEEKER_EMAIL_ERROR);
			
		}
		
		
		
		verificationService.sendEmail(jobSeeker.getEmail());
		jobSeekerService.add(jobSeeker);
		return new SuccessResult(Messages.JOB_SEEKER_ADDED);
	}
	
	
	

	
			
	//jobSeeker
	
	private boolean checkIfRealPerson(String firstName, String lastName, String nationalityNumber, Date birthDate) {
	
			if(checkService.checkIfRealPerson(firstName, lastName, nationalityNumber, birthDate)) {
				return true;
			}
			
			return false;
		
	}
	
	private boolean checkNullValueInJobSeeker(JobSeeker jobSeeker) {
		
			if(jobSeeker.getFirstName() != null &&
					jobSeeker.getLastName() != null &&
					jobSeeker.getNationalityNumber() != null &&
					jobSeeker.getBirthDate() != null) {
				
				return true;
			}
			
			return false;
	}
	
	private boolean checkExistNationalityNumber(String nationalityNumber) {
			if(jobSeekerService.getJobSeekerByNationalityNumber(nationalityNumber).getData() == null) {
				return true;
			}
			
			return false;
	}
	
	private boolean checkEmailExistInJobSeeker(String email) {
		
		if(this.jobSeekerService.getJobSeekerByEmail(email).getData() == null) {
				return true;
		}
	
		return false;
	
	}
	
	
	
	
	
	
	
	
}
