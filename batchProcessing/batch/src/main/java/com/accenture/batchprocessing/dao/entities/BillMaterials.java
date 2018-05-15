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
	
	@OneToMany(mappedBy="bill")
	
	private List<BillToMaterials> billList;

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

	public List<BillToMaterials> getBillList() {
		return billList;
	}

	public void setBillList(List<BillToMaterials> billList) {
		this.billList = billList;
	}

	
	
	
	
	

}
