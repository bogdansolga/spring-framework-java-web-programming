package net.safedata.spring.training.d04.s03.service;

import net.safedata.spring.training.d04.s03.event.ProductRetrievedEvent;
import net.safedata.spring.training.domain.model.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductService.class);

    private final ApplicationEventPublisher applicationEventPublisher;

    @Autowired
    public ProductService(final ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @Transactional(
            readOnly = true,
            propagation = Propagation.SUPPORTS
    )
    public Product get(int id) {
        applicationEventPublisher.publishEvent(new ProductRetrievedEvent("iSomething"));

        LOGGER.info("The product was read successfully");
        return new Product(id, "iSomething", 230d);
    }

    @Transactional(
            readOnly = true,
            propagation = Propagation.SUPPORTS
    )
    public Product throwingGet(int id) {
        applicationEventPublisher.publishEvent(new ProductRetrievedEvent("iSomething"));

        throw new IllegalArgumentException("Can't find the product with the ID " + id);
    }
}
