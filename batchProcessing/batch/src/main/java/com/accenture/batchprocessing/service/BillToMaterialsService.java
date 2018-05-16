package com.accenture.batchprocessing.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.batchprocessing.dao.entities.BillToMaterials;
import com.accenture.batchprocessing.dao.entities.Material;
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
	
	public List<BillToMaterials> findByMaterials(Material material){
		return repo.findByMaterial(material);
	}

	public Set<BigInteger> findMaterial(){
		return repo.getMaterial();
	}
}
