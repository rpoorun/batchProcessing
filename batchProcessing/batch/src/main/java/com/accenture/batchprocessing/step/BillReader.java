package com.accenture.batchprocessing.step;

import java.io.Serializable;
import java.util.Date;

import javax.batch.runtime.BatchStatus;
import javax.batch.runtime.Metric;
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

	@Override
	public long getStepExecutionId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getStepName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BatchStatus getBatchStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Date getStartTime() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Date getEndTime() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getExitStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Serializable getPersistentUserData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Metric[] getMetrics() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
