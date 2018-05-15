package com.accenture.batchprocessing.dao.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.accenture.batchprocessing.dao.entities.BillToMaterials;

@Repository
public interface BillToMaterialsRepo extends CrudRepository<BillToMaterials, Long>{

}
