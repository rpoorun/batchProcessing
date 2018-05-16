package com.accenture.batchprocessing.dao.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Material implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Long materialId;
	
	@Column(name="MATERIAL_DESC")
	private String description;
	
	
	@Column(name="UNIT_PRICE")
	private Double price;

	@OneToMany(mappedBy="material")
	
	private List<BillToMaterials> billList;
	
	@JsonIgnore
	public List<BillToMaterials> getBillList() {
		return billList;
	}

	public void setBillList(List<BillToMaterials> billList) {
		this.billList = billList;
	}

	public Long getMaterialId() {
		return materialId;
	}

	public void setMaterialId(Long materialId) {
		this.materialId = materialId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	} 
	
	
	
	

}
