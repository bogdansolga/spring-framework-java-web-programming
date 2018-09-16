package net.safedata.spring.training.d01.s04.config;

import net.safedata.spring.training.d01.s04.repository.ProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * A simple Spring configuration, which exposes two {@link ProductRepository} {@link Bean}s
 *
 * @author bogdan.solga
 */
@Configuration
@ComponentScan(basePackages = "net.safedata.spring.training")
public class BeanQualifyingConfig {

    public static final String MY_SQL_REPO_BEAN_NAME = "mySQLProductRepository";

    @Bean(name = MY_SQL_REPO_BEAN_NAME)
    public ProductRepository productRepository() {
        return new ProductRepository("MySQL");
    }

    @Bean
    public ProductRepository oracleProductRepository() {
        return new ProductRepository("Oracle");
    }
}
