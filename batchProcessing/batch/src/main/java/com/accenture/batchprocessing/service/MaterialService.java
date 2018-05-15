package com.accenture.batchprocessing.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.batchprocessing.dao.entities.Material;
import com.accenture.batchprocessing.dao.repository.MaterialRepo;

@Service
@Transactional
public class MaterialService {
	
	@Autowired
	private MaterialRepo repo;
	
	public void addMaterial(Material material) {
		
		repo.save(material);
	}
	
	public Material getMaterial(Long materialId) {
		
		Material material = repo.findById(materialId).get();
		
		return material;
	}

}
