package com.example.demo.repository;

import com.example.demo.components.Inventory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin(origins="http://localhost:3000")
public interface InventoryRepository extends CrudRepository<Inventory, Long>{
}