package net.safedata.spring.training.d04.s01.controller;

import net.safedata.spring.training.domain.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/product/sync/{id}")
    public Product getProduct(@PathVariable final int id) {
        return new Product(id, "Tablet", 230d);
    }
}
