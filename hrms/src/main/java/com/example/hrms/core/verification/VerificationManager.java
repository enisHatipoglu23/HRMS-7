package com.example.hrms.core.verification;

import org.springframework.stereotype.Service;

import com.example.hrms.core.utilities.Result;
import com.example.hrms.core.utilities.SuccessResult;

@Service
public class VerificationManager implements VerificationService{

	@Override
	public Result sendEmail(String email) {
		
		return new SuccessResult(
				"Verification mail has been send to ::: "
		+ email + "\n Click the link and verify your account. \n "
				+ "\n Your account is ready to log in. ");
	}

	
	
}
