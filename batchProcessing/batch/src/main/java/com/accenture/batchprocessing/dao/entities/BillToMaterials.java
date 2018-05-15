package com.accenture.batchprocessing.dao.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class BillToMaterials {
	
	
	@Id
	@Column(name="tempId")
	private Long id;
	
	@ManyToOne
	@JoinColumn(referencedColumnName="id")
	private BillMaterials bill;
	
	@ManyToOne
	@JoinColumn(referencedColumnName="materialId")
	private Material material;
	
	public BillMaterials getBill() {
		return bill;
	}

	public void setBill(BillMaterials bill) {
		this.bill = bill;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	@Column(name="QUANTITY")
	private Double quantity;
	

}
