package com.accenture.batchprocessing.dao.repository;

import org.springframework.data.repository.CrudRepository;

import com.accenture.batchprocessing.dao.entities.Material;

public interface MaterialRepo extends CrudRepository<Material, Long> {

}
