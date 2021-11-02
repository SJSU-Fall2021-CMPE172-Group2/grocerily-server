package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Store {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long store_id;
  private String store_name;
  private String store_contact;
  private String store_address;

  public Long getStoreId() {
    return this.store_id;
  }

  public void setStoreId(Long storeId) {
    this.store_id = storeId;
  }

  public String getStoreName() {
    return this.store_name;
  }

  public void setStoreName(String storeName) {
    this.store_name = storeName;
  }

  public String getStoreContact() {
    return this.store_contact;
  }

  public void setStoreContact(String storeContact) {
    this.store_contact = storeContact;
  }

  public String getStoreAddress() {
    return this.store_address;
  }

  public void setStoreAddress(String storeAddress) {
    this.store_address = storeAddress;
  }
}
