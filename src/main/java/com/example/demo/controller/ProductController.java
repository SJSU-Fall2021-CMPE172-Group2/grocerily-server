package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.example.demo.components.Product;
import com.example.demo.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins="http://localhost:3000")
public class ProductController {

  @Autowired
  ProductRepository repo;
  private ArrayList<Product> list;

  @GetMapping()
  public List<Product> getAllProducts() {
    list = new ArrayList<Product>();
    Iterator<Product> it = repo.findAll().iterator();
    while(it.hasNext()) {
      list.add(it.next());
    }
    return list;
  }

  @GetMapping("/{productId}")
  public Product getProductByID(@PathVariable Long productId) {
    return repo.findById(productId).get();
  }

  /*
    Bug 1: when create new product, different product id is stored in api not what it meant to be.
  */
  @PostMapping("/create")
  public void createProduct(@RequestParam(required = false) Long productId, @RequestParam Long catId, @RequestParam String productName) {
    Product product = new Product();
    product.setProductId(productId);
    product.setCatId(catId);
    product.setProductName(productName);
    repo.save(product);
  }

  @PutMapping("/update")
  public void updateProduct(@RequestParam Long productId, @RequestParam Long catId, @RequestParam String productName) {
    Product productToUpdate = repo.findById(productId).get();
    productToUpdate.setCatId(catId);
    productToUpdate.setProductName(productName);
    repo.save(productToUpdate);
  }

  @DeleteMapping("/delete/{productId}")
  public void deleteProduct(@PathVariable String productId) {
    repo.deleteById(Long.parseLong(productId));
  }
}

