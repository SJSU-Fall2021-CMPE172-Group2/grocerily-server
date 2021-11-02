package com.example.demo.components;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Inventory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long inventory_id;
  private Long product_id;
  private Long store_id;
  private Long quantity;
  private Double unit_price;
  private Date stock_date;
  
  public Long getInventoryId() {
    return this.inventory_id;
  }

  public void setInventoryId(Long inventory_id) {
    this.inventory_id = inventory_id;
  }

  public Long getProductId() {
    return this.product_id;
  }

  public void setProductId(Long product_id) {
    this.product_id = product_id;
  }

  public Long getStoreId() {
    return this.store_id;
  }

  public void setStoreId(Long store_id) {
    this.store_id = store_id;
  }

  public Long getQuantity() {
    return this.quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public Double getUnitPrice() {
    return this.unit_price;
  }

  public void setUnitPrice(Double unit_price) {
    this.unit_price = unit_price;
  }

  public Date getStockDate() {
    return this.stock_date;
  }

  public void setStockDate(Date stock_date) {
    this.stock_date = stock_date;
  }

}
