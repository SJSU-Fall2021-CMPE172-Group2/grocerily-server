package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.example.demo.components.User;
import com.example.demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  UserRepository repo;
  private ArrayList<User> list;

  @GetMapping()
  public List<User> getAllUsers() {
    list = new ArrayList<User>();
    Iterator<User> it = repo.findAll().iterator();
    while(it.hasNext()) {
      list.add(it.next());
    }
    return list;
  }

  @GetMapping("/{userId}")
  public User getUserByID(@PathVariable Long userId) {
    return repo.findById(userId).get();
  }

  /*
    Bug 1: when create new user, different user id is stored in api not what it meant to be.
  */
  @PostMapping("/create")
  public void createUser(@RequestParam(required = false) Long userId, @RequestParam String username, @RequestParam String password, @RequestParam Long storeId) {
    User user = new User();
    user.setUserId(userId);
    user.setUsername(username);
    user.setPassword(password);
    user.setStoreId(storeId);
    repo.save(user);
  }

  @PutMapping("/update")
  public void updateUser(@RequestParam Long userId, @RequestParam String username, @RequestParam String password, @RequestParam Long storeId) {
    User userToUpdate = repo.findById(userId).get();
    userToUpdate.setUsername(username);
    userToUpdate.setPassword(password);
    userToUpdate.setStoreId(storeId);
    repo.save(userToUpdate);
  }

  @DeleteMapping("/delete/{userId}")
  public void deleteUser(@PathVariable String userId) {
    repo.deleteById(Long.parseLong(userId));
  }
}

