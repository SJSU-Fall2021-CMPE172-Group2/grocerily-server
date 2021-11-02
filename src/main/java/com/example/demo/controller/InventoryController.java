package com.example.demo.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.example.demo.components.Inventory;
import com.example.demo.repository.InventoryRepository;

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
@RequestMapping("/inventory")
public class InventoryController {

  @Autowired
  InventoryRepository repo;
  private ArrayList<Inventory> list;

  @GetMapping()
  public List<Inventory> getAllInventorys() {
    list = new ArrayList<Inventory>();
    Iterator<Inventory> it = repo.findAll().iterator();
    while(it.hasNext()) {
      list.add(it.next());
    }
    return list;
  }

  @GetMapping("/{productId}")
  public Inventory getInventoryByID(@PathVariable String productId) {
    return repo.findById(Long.parseLong(productId)).get();
  }

  
  @PostMapping("/create")
  public void createInventory(@RequestParam(required = false) Long inventoryId, @RequestParam Long productId, 
                              @RequestParam Long storeId, @RequestParam Long quantity, 
                              @RequestParam Double unitPrice, @RequestParam Date stockDate) {
    Inventory inventory = new Inventory();
    inventory.setInventoryId(inventoryId);
    inventory.setProductId(productId);
    inventory.setStoreId(storeId);
    inventory.setQuantity(quantity);
    inventory.setUnitPrice(unitPrice);
    inventory.setStockDate(stockDate);
    repo.save(inventory);
  }

  @PutMapping("/update")
  public void updateInventory(@RequestParam Long inventoryId, @RequestParam Long productId, 
                              @RequestParam Long storeId, @RequestParam Long quantity, 
                              @RequestParam Double unitPrice, @RequestParam Date stockDate) {
    Inventory inventoryToUpdate = repo.findById(inventoryId).get();
    inventoryToUpdate.setInventoryId(inventoryId);
    inventoryToUpdate.setProductId(productId);
    inventoryToUpdate.setStoreId(storeId);
    inventoryToUpdate.setQuantity(quantity);
    inventoryToUpdate.setUnitPrice(unitPrice);
    inventoryToUpdate.setStockDate(stockDate);
    repo.save(inventoryToUpdate);
  }

  @DeleteMapping("/delete/{inventoryId}")
  public void deleteInventory(@PathVariable Long inventoryId) {
    repo.deleteById(inventoryId);
  }
}

