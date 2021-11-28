package edu.sjsu.enterprise.grocery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.sjsu.enterprise.grocery.Inventory;
import edu.sjsu.enterprise.grocery.InventoryRepository;

@Controller
@RequestMapping(path = "/inventory")
public class InventoryController {

	@Autowired
	private InventoryRepository inventoryRepository;

	@PostMapping(path = "/add", consumes = "application/json")
	public @ResponseBody String addInventory(@RequestBody Inventory inventory) {
		inventoryRepository.save(inventory);

		return "Saved:" + inventory;
	}

	@GetMapping(path = "/all", produces = "application/json")
	public @ResponseBody Iterable<Inventory> getAllInventory() {
		// This returns a JSON or XML with the inventory
		return inventoryRepository.findAll();
	}
}