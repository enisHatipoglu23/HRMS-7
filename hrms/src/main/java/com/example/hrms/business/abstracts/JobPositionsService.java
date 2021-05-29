package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.core.utilities.DataResult;
import com.example.hrms.core.utilities.Result;
import com.example.hrms.entities.JobPositions;

public interface JobPositionsService {

	DataResult<List<JobPositions>> getAll();
	DataResult<JobPositions> getByJobPosition(String job);
	Result add(JobPositions jobPositions);
	Result update(JobPositions jobPositions);
	Result delete(JobPositions jobPositions);
}
