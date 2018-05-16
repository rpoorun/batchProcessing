package com.accenture.batchprocessing.dao.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Output {
	
	@Id
	private String materialDesc;
	
	private Long totalQuantity;

	public String getMaterialDesc() {
		return materialDesc;
	}

	public void setMaterialDesc(String materialDesc) {
		this.materialDesc = materialDesc;
	}

	public Long getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(Long totalQuantity) {
		this.totalQuantity = totalQuantity;
	}
	
	

}
