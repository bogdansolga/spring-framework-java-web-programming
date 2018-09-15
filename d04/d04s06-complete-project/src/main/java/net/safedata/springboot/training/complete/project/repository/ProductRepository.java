package net.safedata.springboot.training.complete.project.repository;

import net.safedata.springboot.training.complete.project.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
