package edu.sjsu.enterprise.grocery;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Inventory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "inventory_id")
	private Integer inventoryId;

	private Float quantity;

	private Float unit_price;

	private Date expiration;

	public Integer getStore_id() {
		return store_id;
	}

	public void setStore_id(Integer store_id) {
		this.store_id = store_id;
	}

	@Override
	public String toString() {
		return "Inventory [inventoryId=" + inventoryId + ", quantity=" + quantity + ", unit_price=" + unit_price
				+ ", expiration=" + expiration + ", store_id=" + store_id + ", product=" + product + "]";
	}

	private Integer store_id;

	public Float getQuantity() {
		return quantity;
	}

	public Integer getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(Integer inventoryId) {
		this.inventoryId = inventoryId;
	}

	public void setQuantity(Float quantity) {
		this.quantity = quantity;
	}

	public Float getUnit_price() {
		return unit_price;
	}

	public Products getProduct() {
		return product;
	}

	public void setProduct(Products product) {
		this.product = product;
	}

	public void setUnit_price(Float unit_price) {
		this.unit_price = unit_price;
	}

	public Date getExpiration() {
		return expiration;
	}

	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "product_id", nullable = false)
	private Products product;

}
