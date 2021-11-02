package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Store {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long storeId;
  private String storeName;
  private String storeContact;
  private String storeAddress;

  public Long getStoreId() {
    return this.storeId;
  }

  public void setStoreId(Long storeId) {
    this.storeId = storeId;
  }

  public String getStoreName() {
    return this.storeName;
  }

  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }

  public String getStoreContact() {
    return this.storeContact;
  }

  public void setStoreContact(String storeContact) {
    this.storeContact = storeContact;
  }

  public String getStoreAddress() {
    return this.storeAddress;
  }

  public void setStoreAddress(String storeAddress) {
    this.storeAddress = storeAddress;
  }
}
