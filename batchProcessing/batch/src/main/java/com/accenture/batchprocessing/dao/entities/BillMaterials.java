package com.accenture.batchprocessing.dao.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class BillMaterials {
	
	@Id
	private Long id;
	
	@Column(name="JOB_NUMBER")
	private String jobNumber;
	
	@OneToMany
	@JoinColumn(name="MATERIALS")
	private List<Material> materials;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getJobNumber() {
		return jobNumber;
	}

	public void setJobNumber(String jobNumber) {
		this.jobNumber = jobNumber;
	}

	public List<Material> getMaterials() {
		return materials;
	}

	public void setMaterials(List<Material> materials) {
		this.materials = materials;
	}
	
	
	
	
	
	
	
	

}
