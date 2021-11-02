package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
  @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long user_id;
  private String username;
  private String password;
  private Long store_id;


  public Long getUserId() {
    return this.user_id;
  }

  public void setUserId(Long userId) {
    this.user_id = userId;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Long getStoreId() {
    return this.store_id;
  }

  public void setStoreId(Long storeId) {
    this.store_id = storeId;
  }

}
