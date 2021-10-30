package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long product_id;
	private String product_name;
	private Long cat_id;

	public Long getProductId() {
		return product_id;
	}

	public void setProductId(Long id) {
		this.product_id = id;
	}

	public String getProductName() {
		return product_name;
	}

	public void setProductName(String product_name) {
		this.product_name = product_name;
	}

	public Long getCatId() {
		return cat_id;
	}

	public void setCatId(Long cat_id) {
		this.cat_id = cat_id;
	}
	
	
	
}
