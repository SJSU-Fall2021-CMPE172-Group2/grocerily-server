package com.example.demo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Inventory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long product_id;
  private Long store_id;
  private Long quantity;
  private Long unit_price;
  private Date stock_date;
  

  public Long getProduct_id() {
    return this.product_id;
  }

  public void setProduct_id(Long product_id) {
    this.product_id = product_id;
  }

  public Long getStore_id() {
    return this.store_id;
  }

  public void setStore_id(Long store_id) {
    this.store_id = store_id;
  }

  public Long getQuantity() {
    return this.quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public Long getUnit_price() {
    return this.unit_price;
  }

  public void setUnit_price(Long unit_price) {
    this.unit_price = unit_price;
  }

  public Date getStock_date() {
    return this.stock_date;
  }

  public void setStock_date(Date stock_date) {
    this.stock_date = stock_date;
  }

}
