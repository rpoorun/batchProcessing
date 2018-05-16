package com.accenture.batchprocessing.step;

import java.util.List;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.annotation.Autowired;

import com.accenture.batchprocessing.dao.entities.BillMaterials;
import com.accenture.batchprocessing.service.BillMaterialsService;

public class Reader implements ItemReader<String>{

	@Autowired
	private BillMaterialsService billMaterialsService;
	
	@Override
	public String read()
			throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {

		if(billMaterialsService.getAllBillOfMaterial() != null) {
			System.out.println("Proceed to Proccessing");
		}else {
			System.out.println("Table is empty");
		}
		
		return null;
	}

}
