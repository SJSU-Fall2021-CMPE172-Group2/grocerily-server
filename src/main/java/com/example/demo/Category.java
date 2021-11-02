package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long catId;
	private String catName;

	public Long getCategoryId() {
		return catId;
	}

	public void setCategoryId(Long id) {
		this.catId = id;
	}

	public String getCategoryName() {
		return catName;
	}

	public void setCategoryName(String name) {
		this.catName = name;
	}
}
