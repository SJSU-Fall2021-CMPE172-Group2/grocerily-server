package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Supply {
  @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;
  private Long supId;

  public Long getProduct_id() {
    return this.productId;
  }

  public void setProduct_id(Long productId) {
    this.productId = productId;
  }

  public Long getSupId() {
    return this.supId;
  }

  public void setSupId(Long supId) {
    this.supId = supId;
  }
}
