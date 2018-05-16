package com.accenture.batchprocessing.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.accenture.batchprocessing.tasklet.TaskletStep;

@Configuration
public class BatchConfig {
 
	@Autowired
	TaskletStep taskletStep;
	
    @Autowired
    public JobBuilderFactory jobBuilderFactory;
 
    @Autowired
    public StepBuilderFactory stepBuilderFactory;
 
    @Bean
    public Job job() {
    	return jobBuilderFactory.get("job")
    			.incrementer(new RunIdIncrementer())
    			.start(step1())
    			.build();
    }

    @Bean
	public Step step1() {
		
		return stepBuilderFactory.get("step1")
        		.tasklet(taskletStep)
                .build();
	}

}
