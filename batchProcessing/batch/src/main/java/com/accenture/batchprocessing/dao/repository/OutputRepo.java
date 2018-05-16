package com.accenture.batchprocessing.dao.repository;

import org.springframework.data.repository.CrudRepository;

import com.accenture.batchprocessing.dao.entities.Output;

public interface OutputRepo extends CrudRepository<Output, String>{

}
