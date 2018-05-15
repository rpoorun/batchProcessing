package com.accenture.batchprocessing.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class BatchConfig {
	
	@Autowired
	private  JobBuilderFactory jbf;
	
	@Autowired
	private StepBuilderFactory sbf;
	
//	@Autowired
//	private TaskletStep taskletStep;
	
	@Bean
	public Job job() {
		return jbf.get("job")
				.incrementer(new RunIdIncrementer())
				.start(readDatabase())
				.next(processQuantity())
				.next(writeToCSV())
				.build();
	}
	
	@Bean 
	public Step readDatabase() {
		return sbf.get("readDatabase")
				.tasklet(new BillReader())
				.build();
	}
	
	@Bean
	public Step processQuantity() {
		
		return sbf.get("processQuantity")
				.tasklet(new Qtyprocessor())
				.build();
	}
	
	@Bean
	public Step writeToCSV() {
		return sbf.get("writeToCSV")
				.writer(new FileWriter())
				.build();
				
	}
	
	

	

}