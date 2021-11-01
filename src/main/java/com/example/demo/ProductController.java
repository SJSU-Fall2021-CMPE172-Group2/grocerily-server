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
@RequestMapping("/product")
public class ProductController {

  @Autowired
  ProductRepository productRepo;
  private ArrayList<Product> list;

  @GetMapping()
  public List<Product> getAllProducts() {
    list = new ArrayList<Product>();
    Iterator<Product> it = productRepo.findAll().iterator();
    while(it.hasNext()) {
      list.add(it.next());
    }
    return list;
  }

  @GetMapping("/{productId}")
  public Product getProductByID(@PathVariable Long productId) {
    return productRepo.findById(productId).get();
  }

  /*
    Bug 1: when create new product, different product id is stored in api not what it meant to be.
  */
  @PostMapping("/create")
  public void createProduct(@RequestParam String productId, @RequestParam String catId, @RequestParam String productName) {
    Product product = new Product();
    product.setProductId(Long.parseLong(productId));
    product.setProductName(productName);
    product.setCatId(Long.parseLong(catId));
    productRepo.save(product);
  }

  @PutMapping("/update")
  public void updateProduct(@RequestParam String productId, @RequestParam String catId, @RequestParam String productName) {
    Product productToUpdate = productRepo.findById(Long.parseLong(productId)).get();
    productToUpdate.setCatId(Long.parseLong(catId));
    productToUpdate.setProductName(productName);
    productRepo.save(productToUpdate);
  }

  @DeleteMapping("/delete/{productId}")
  public void deleteProduct(@PathVariable String productId) {
    productRepo.deleteById(Long.parseLong(productId));
  }
}

