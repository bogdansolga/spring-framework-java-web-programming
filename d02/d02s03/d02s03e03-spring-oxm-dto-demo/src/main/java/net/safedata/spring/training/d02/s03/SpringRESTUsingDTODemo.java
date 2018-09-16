package net.safedata.spring.training.d02.s03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;

/**
 * A small Spring Boot demo used to showcase the usage of a REST service with OXM serialization using DTOs
 *
 * @author bogdan.solga
 */
@SpringBootApplication(exclude = JacksonAutoConfiguration.class)
public class SpringRESTUsingDTODemo {

    public static void main(String[] args) {
        SpringApplication.run(SpringRESTUsingDTODemo.class, args);
    }
}
