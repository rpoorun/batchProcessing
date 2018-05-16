package com.accenture.batchprocessing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.batchprocessing.dao.entities.Output;
import com.accenture.batchprocessing.dao.repository.OutputRepo;

@Service
public class OutputService {
	
	@Autowired
	private OutputRepo outputRepo;
	
	public void createOutput(String desc, long quantity) {
		Output output = new Output();
		output.setMaterialDesc(desc);
		output.setTotalQuantity(quantity);
		outputRepo.save(output);
	}

}
