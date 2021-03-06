package com.accenture.batchprocessing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.batchprocessing.dao.entities.Output;
import com.accenture.batchprocessing.dao.repository.OutputRepo;

@Service
@Transactional
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
