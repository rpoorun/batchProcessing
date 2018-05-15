package com.accenture.batchprocessing.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.batchprocessing.dao.entities.BillMaterials;
import com.accenture.batchprocessing.dao.repository.BillMaterialsRepo;

@Service
@Transactional
public class BillMaterialsService {
	
	@Autowired
	private BillMaterialsRepo repo;
	
	
	public List<BillMaterials> getAllBillOfMaterial(){
		
		List<BillMaterials> list = new ArrayList<>	();
		
		repo.findAll().forEach(list::add);
		
		return list;
		
		
	}
	
	
	
	public void createBill(BillMaterials bill) {
		
		repo.save(bill);
	}

}
