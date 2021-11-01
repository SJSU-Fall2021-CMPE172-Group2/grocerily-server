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


  public Long getUser_id() {
    return this.user_id;
  }

  public void setUser_id(Long user_id) {
    this.user_id = user_id;
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

  public Long getStore_id() {
    return this.store_id;
  }

  public void setStore_id(Long store_id) {
    this.store_id = store_id;
  }

}
