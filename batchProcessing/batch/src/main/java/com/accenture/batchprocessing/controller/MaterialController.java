package com.accenture.batchprocessing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.batchprocessing.dao.entities.Material;
import com.accenture.batchprocessing.service.MaterialService;

@RestController
@RequestMapping("/material")
public class MaterialController {
	
	
	@Autowired
	private MaterialService service;
	
	@PostMapping
	public void addMaterial(@RequestBody Material m) {
		
		service.addMaterial(m);
	}
	
	

}
