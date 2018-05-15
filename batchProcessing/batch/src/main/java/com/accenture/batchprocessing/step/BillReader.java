package com.accenture.batchprocessing.step;

import javax.batch.api.chunk.ItemReader;
import javax.batch.runtime.StepExecution;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class BillReader implements Tasklet, StepExecution{

	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
