package com.accenture.batchprocessing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.batchprocessing.dao.entities.BillMaterials;
import com.accenture.batchprocessing.service.BillMaterialsService;

@RestController
@RequestMapping("/bill")
public class BillMaterialsController {

	@Autowired
	private BillMaterialsService service;
	
	@GetMapping
	public List<BillMaterials> getAllBill(){
		
		return service.getAllBillOfMaterial();
	}
	
	
	@PostMapping
	public void addBillOfMaterials(@RequestBody BillMaterials bill) {
		
		service.createBill(bill);
		
	}
}
