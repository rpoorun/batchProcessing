package com.accenture.batchprocessing.dao.repository;

import java.math.BigInteger;
import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.accenture.batchprocessing.dao.entities.BillToMaterials;
import com.accenture.batchprocessing.dao.entities.Material;

@Repository
public interface BillToMaterialsRepo extends CrudRepository<BillToMaterials, Long>{

	public List<BillToMaterials> findByMaterial(Material material);
	
	@Query(value="SELECT material_material_id FROM bill_to_materials", nativeQuery = true)
	public Set<BigInteger> getMaterial();
}
