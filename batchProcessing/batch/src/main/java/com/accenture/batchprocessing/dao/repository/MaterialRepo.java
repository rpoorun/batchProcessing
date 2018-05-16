package com.accenture.batchprocessing.dao.repository;

import java.math.BigInteger;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.accenture.batchprocessing.dao.entities.Material;

public interface MaterialRepo extends CrudRepository<Material, Long> {

	Optional<Material> findByMaterialId(Long longId);

}
