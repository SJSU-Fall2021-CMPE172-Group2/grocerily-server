package edu.sjsu.enterprise.grocery;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface IRestRepository extends CrudRepository<Product, Long>{
}
