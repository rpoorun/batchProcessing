package com.accenture.batchprocessing.tasklet;

import java.math.BigInteger;
import java.util.List;
import java.util.Set;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.accenture.batchprocessing.dao.entities.BillToMaterials;
import com.accenture.batchprocessing.dao.entities.Material;
import com.accenture.batchprocessing.service.BillToMaterialsService;
import com.accenture.batchprocessing.service.MaterialService;
import com.accenture.batchprocessing.service.OutputService;

@Component
public class TaskletStep implements Tasklet {
	
	@Autowired
	private MaterialService materialService;
	@Autowired
	private BillToMaterialsService billToMaterialsService;
	@Autowired
	private OutputService outputService;
	
	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		Set<BigInteger> materialIds = billToMaterialsService.findMaterial();
		
		for (BigInteger id : materialIds) {
			Long longId = Long.parseLong(id.toString());
			Material material = materialService.getMaterial(longId);
			List<BillToMaterials> list = billToMaterialsService.findByMaterials(material);
			long quantity = 0;
			for (BillToMaterials billToMaterials : list) {
				quantity += billToMaterials.getQuantity();
			}
			outputService.createOutput(material.getDescription(), quantity);
		}

		return null;
	}

}
