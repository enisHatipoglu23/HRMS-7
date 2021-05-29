package com.example.hrms.core.adapters.abstracts;

import java.sql.Date;

public interface CheckService {

	boolean checkIfRealPerson(String firstName, String lastName, String nationalityNumber, Date birthDate );
	
}
