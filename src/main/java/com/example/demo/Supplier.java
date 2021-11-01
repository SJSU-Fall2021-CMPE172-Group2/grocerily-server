package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Supplier {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sup_id;	
	private String supplier_name;
	private String supplier_contact;
	

	public Long getSupId() {
		return this.sup_id;
	}

	public void setSupId(Long sup_id) {
		this.sup_id = sup_id;
	}

	public String getSupplier_name() {
		return this.supplier_name;
	}

	public void setSupplier_name(String supplier_name) {
		this.supplier_name = supplier_name;
	}

	public String getSupplier_contact() {
		return this.supplier_contact;
	}

	public void setSupplier_contact(String supplier_contact) {
		this.supplier_contact = supplier_contact;
	}

	
}
