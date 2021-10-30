package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Supply {
  @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long product_id;
  private Long sup_id;

  public Long getProduct_id() {
    return this.product_id;
  }

  public void setProduct_id(Long product_id) {
    this.product_id = product_id;
  }

  public Long getSup_id() {
    return this.sup_id;
  }

  public void setSup_id(Long sup_id) {
    this.sup_id = sup_id;
  }
}
