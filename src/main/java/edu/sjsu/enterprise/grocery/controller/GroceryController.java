package edu.sjsu.enterprise.grocery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.sjsu.enterprise.grocery.Products;
import edu.sjsu.enterprise.grocery.ProductRepository;

@Controller
@RequestMapping(path="/product")
public class GroceryController {
  @Autowired
  private ProductRepository productRepository;

  @PostMapping(path="/add", consumes = "application/json")
  public @ResponseBody String addNewUser (@RequestBody Products product) {
    productRepository.save(product);
    return "Saved";
  }

  @GetMapping(path="/all", produces = "application/json")
  public @ResponseBody Iterable<Products> getAllUsers() {
    // This returns a JSON or XML with the users
    return productRepository.findAll();
  }
}