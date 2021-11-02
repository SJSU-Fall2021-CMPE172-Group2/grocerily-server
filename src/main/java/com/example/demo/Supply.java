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

  public Long getProductId() {
    return this.product_id;
  }

  public void setProductId(Long productId) {
    this.product_id = productId;
  }

  public Long getSupId() {
    return this.sup_id;
  }

  public void setSupId(Long supId) {
    this.sup_id = supId;
  }
}
