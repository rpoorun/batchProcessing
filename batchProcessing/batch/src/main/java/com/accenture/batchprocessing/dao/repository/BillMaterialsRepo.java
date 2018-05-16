package com.accenture.batchprocessing.dao.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.accenture.batchprocessing.dao.entities.BillMaterials;

@Repository
public interface BillMaterialsRepo extends CrudRepository<BillMaterials, Long>{

	
}
