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

  public Long getStore_id() {
    return this.store_id;
  }

  public void setStore_id(Long store_id) {
    this.store_id = store_id;
  }

  public String getStore_name() {
    return this.store_name;
  }

  public void setStore_name(String store_name) {
    this.store_name = store_name;
  }

  public String getStore_contact() {
    return this.store_contact;
  }

  public void setStore_contact(String store_contact) {
    this.store_contact = store_contact;
  }

  public String getStore_address() {
    return this.store_address;
  }

  public void setStore_address(String store_address) {
    this.store_address = store_address;
  }
}
