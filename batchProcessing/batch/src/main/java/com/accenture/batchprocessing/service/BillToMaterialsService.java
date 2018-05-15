package com.accenture.batchprocessing.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.batchprocessing.dao.entities.BillToMaterials;
import com.accenture.batchprocessing.dao.repository.BillToMaterialsRepo;

@Service
@Transactional
public class BillToMaterialsService {
	
	@Autowired
	private BillToMaterialsRepo repo;
	
	
	public void addBillToMaterial(BillToMaterials billToMaterial) {
			repo.save(billToMaterial);
	}
	
	
	public BillToMaterials getBillToMaterial(Long id) {
		
		BillToMaterials m = repo.findById(id).get();
		
		return m;
	}

}
