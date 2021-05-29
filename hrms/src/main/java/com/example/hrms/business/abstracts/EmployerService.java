package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.core.utilities.DataResult;
import com.example.hrms.core.utilities.Result;
import com.example.hrms.entities.Employer;

public interface EmployerService {

			DataResult<Employer> getEmployerByEmail(String email);
	
			DataResult<List<Employer>> getAll();
			Result add(Employer employer  );
		    Result update(Employer employer);
		    Result delete(Employer employer);

		
	
}
