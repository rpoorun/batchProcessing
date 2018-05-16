package com.accenture.batchprocessing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.batchprocessing.dao.entities.BillToMaterials;
import com.accenture.batchprocessing.service.BillToMaterialsService;

@RestController
@RequestMapping("/billtomaterial")
public class BillToMaterialsController {
	
	@Autowired
	private BillToMaterialsService service; 
	
	@PostMapping
	public void addBillToMaterials(@RequestBody BillToMaterials m) {
		
		service.addBillToMaterial(m);
	}
	
	

}
