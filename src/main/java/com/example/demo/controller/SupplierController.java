package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.example.demo.components.Supplier;
import com.example.demo.repository.SupplierRepository;

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
@RequestMapping("/supplier")
public class SupplierController {

  @Autowired
  SupplierRepository repo;
  private ArrayList<Supplier> list;

  @GetMapping()
  public List<Supplier> getAllSuppliers() {
    list = new ArrayList<Supplier>();
    Iterator<Supplier> it = repo.findAll().iterator();
    while(it.hasNext()) {
      list.add(it.next());
    }
    return list;
  }

  @GetMapping("/{supplierId}")
  public Supplier getSupplierByID(@PathVariable Long supplierId) {
    return repo.findById(supplierId).get();
  }

  /*
    Bug 1: when create new supplier, different supplier id is stored in api not what it meant to be.
  */
  @PostMapping("/create")
  public void createSupplier(@RequestParam(required = false) Long supplierId, @RequestParam String supplierName, @RequestParam String supplierContact) {
    Supplier supplier = new Supplier();
    supplier.setSupplierId(supplierId);
    supplier.setSupplierName(supplierName);
    supplier.setSupplierContact(supplierContact);
    repo.save(supplier);
  }

  @PutMapping("/update")
  public void updateSupplier(@RequestParam Long supplierId, @RequestParam String supplierName, @RequestParam String supplierContact) {
    Supplier supplierToUpdate = repo.findById(supplierId).get();
    supplierToUpdate.setSupplierName(supplierName);
    supplierToUpdate.setSupplierContact(supplierContact);
    repo.save(supplierToUpdate);
  }

  @DeleteMapping("/delete/{supplierId}")
  public void deleteSupplier(@PathVariable String supplierId) {
    repo.deleteById(Long.parseLong(supplierId));
  }
}

