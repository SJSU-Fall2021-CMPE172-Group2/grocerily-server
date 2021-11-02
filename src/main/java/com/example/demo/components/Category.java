package com.example.demo.components;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cat_id;
	private String cat_name;

	public Long getCategoryId() {
		return cat_id;
	}

	public void setCategoryId(Long id) {
		this.cat_id = id;
	}

	public String getCategoryName() {
		return cat_name;
	}

	public void setCategoryName(String name) {
		this.cat_name = name;
	}
}
