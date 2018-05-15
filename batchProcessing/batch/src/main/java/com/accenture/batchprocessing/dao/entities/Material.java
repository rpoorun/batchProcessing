package com.accenture.batchprocessing.dao.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Material {
	
	@Id
	private Long materialId;
	
	@Column(name="MATERIAL_DESC")
	private String description;
	
	@Column(name="QUANTITY")
	private Integer quantity;
	
	@Column(name="UNIT_PRICE")
	private Double price;

	@ManyToOne
	private BillMaterials billMaterial;
	
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

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	} 
	
	
	
	

}
