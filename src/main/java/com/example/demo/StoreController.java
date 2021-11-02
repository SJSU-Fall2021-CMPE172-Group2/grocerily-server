package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
@RequestMapping("/store")
public class StoreController {

  @Autowired
  StoreRepository repo;
  @Autowired
  InventoryRepository inventoryRepo;
  private ArrayList<Store> list;

  @GetMapping()
  public List<Store> getAllStores() {
    list = new ArrayList<Store>();
    Iterator<Store> it = repo.findAll().iterator();
    while(it.hasNext()) {
      list.add(it.next());
    }
    return list;
  }

  @GetMapping("/{storeId}")
  public Store getStoreByID(@PathVariable Long storeId) {
    return repo.findById(storeId).get();
  }

  @GetMapping("/{storeId}/inventory")
  public ArrayList<Inventory> getAllInventoryByStoreId(@PathVariable Long storeId) {
    ArrayList<Inventory> inventoryList = new ArrayList<Inventory>();
    Iterator<Inventory> it = inventoryRepo.findAll().iterator();
    while(it.hasNext()) {
      Inventory inventory = it.next();
      if(inventory.getStoreId().equals(storeId)){
        inventoryList.add(inventory);
      }
    }
    return inventoryList;
  }

  /*
    Bug 1: when create new product, different product id is stored in api not what it meant to be.
  */
  @PostMapping("/create")
  public void createStore(@RequestParam(required = false) Long storeId, @RequestParam String storeName, @RequestParam String storeAddress, @RequestParam String storeContact) {
    Store store = new Store();
    store.setStoreId(storeId);
    store.setStoreName(storeName);
    store.setStoreAddress(storeAddress);
    store.setStoreContact(storeContact);
    repo.save(store);
  }

  @PutMapping("/update")
  public void updateStore(@RequestParam Long storeId, @RequestParam String storeName, @RequestParam String storeAddress, @RequestParam String storeContact) {
    Store storeToUpdate = repo.findById(storeId).get();
    storeToUpdate.setStoreName(storeName);
    storeToUpdate.setStoreAddress(storeAddress);
    storeToUpdate.setStoreContact(storeContact);
    repo.save(storeToUpdate);
  }

  @DeleteMapping("/delete/{storeId}")
  public void deletesStore(@PathVariable String storeId) {
    repo.deleteById(Long.parseLong(storeId));
  }
}

