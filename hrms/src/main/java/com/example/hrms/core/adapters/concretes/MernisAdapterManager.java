package com.example.hrms.core.adapters.concretes;

import java.sql.Date;

import org.springframework.stereotype.Service;

import com.example.hrms.Mernis.MernisManager;
import com.example.hrms.core.adapters.abstracts.CheckService;

@Service
public class MernisAdapterManager implements CheckService{

	
	
	
	@Override
	public boolean checkIfRealPerson(String firstName, String lastName, String nationalityNumber, Date birthDate) {

		MernisManager mernisManager = new MernisManager();
		
		boolean result = mernisManager.ifValidPerson(firstName, lastName, nationalityNumber, birthDate);
		
		if(!result) {
			System.out.println("Person is not valid!!!");
			return false;
		}
		
		return true;
	}

	
	
}
