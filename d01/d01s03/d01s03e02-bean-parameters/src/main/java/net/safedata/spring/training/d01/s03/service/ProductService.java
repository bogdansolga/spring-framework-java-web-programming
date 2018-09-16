package net.safedata.spring.training.d01.s03.service;

import net.safedata.spring.training.d01.s03.repository.ProductRepository;

/**
 * A simple product service, which uses a {@link ProductRepository} as a collaborator
 *
 * @author bogdan.solga
 */
public final class ProductService {

    private final ProductRepository productRepository;

    public ProductService(final ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void displayProducts() {
        productRepository.displayProducts();
    }

    public void onClose() {
        System.out.println("Closing the used resources...");
    }
}
