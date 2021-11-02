package com.example.demo.components;

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
	

	public Long getSupplierId() {
		return this.sup_id;
	}

	public void setSupplierId(Long supplierId) {
		this.sup_id = supplierId;
	}

	public String getSupplierName() {
		return this.supplier_name;
	}

	public void setSupplierName(String supplierName) {
		this.supplier_name = supplierName;
	}

	public String getSupplierContact() {
		return this.supplier_contact;
	}

	public void setSupplierContact(String supplierContact) {
		this.supplier_contact = supplierContact;
	}	
}
