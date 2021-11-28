package edu.sjsu.enterprise.grocery;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface InventoryRepository extends CrudRepository<Inventory, Long> {
	public List<Inventory> findByInventoryId(Integer id);
}
