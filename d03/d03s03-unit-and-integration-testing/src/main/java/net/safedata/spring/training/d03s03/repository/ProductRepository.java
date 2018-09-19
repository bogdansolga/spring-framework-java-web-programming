package net.safedata.spring.training.d03s03.repository;

import net.safedata.spring.training.d03s03.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
