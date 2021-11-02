package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.example.demo.components.Category;
import com.example.demo.repository.CategoryRepository;

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
@RequestMapping("/category")
public class CategoryController {

  @Autowired
  CategoryRepository repo;
  private ArrayList<Category> list;

  @GetMapping()
  public List<Category> getAllCategorys() {
    list = new ArrayList<Category>();
    Iterator<Category> it = repo.findAll().iterator();
    while(it.hasNext()) {
      list.add(it.next());
    }
    return list;
  }

  @GetMapping("/{categoryId}")
  public Category getcategoryByID(@PathVariable Long categoryId) {
    return repo.findById(categoryId).get();
  }

  /*
    Bug 1: when create new category, different category id is stored in api not what it meant to be.
  */
  @PostMapping("/create")
  public void createCategory(@RequestParam(required = false) Long categoryId, @RequestParam String categoryName) {
    Category category = new Category();
    category.setCategoryId(categoryId);
    category.setCategoryName(categoryName);
    repo.save(category);
  }

  @PutMapping("/update")
  public void updatecategory(@RequestParam Long categoryId, @RequestParam String categoryName) {
    Category categoryToUpdate = repo.findById(categoryId).get();
    categoryToUpdate.setCategoryId(categoryId);
    categoryToUpdate.setCategoryName(categoryName);
    repo.save(categoryToUpdate);
  }

  @DeleteMapping("/delete/{categoryId}")
  public void deleteCategory(@PathVariable String categoryId) {
    repo.deleteById(Long.parseLong(categoryId));
  }
}

