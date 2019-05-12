package com.lfmteixeira.catalog.controller;

import com.lfmteixeira.catalog.model.Product;
import com.lfmteixeira.catalog.repository.ProductRepository;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.util.List;

@Controller("/product")
public class ProductController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

    @Inject
    private ProductRepository repository;

    @Post
    public Product add(@Body Product product) {
        LOGGER.info("Product add: {}", product);
        return repository.addProduct(product);
    }

    @Get("/{id}")
    public Product findById(Long id) {
        LOGGER.info("Product find: {}", id);
        return repository.findById(id);
    }

    @Get
    public List<Product> findALl() {
        LOGGER.info("Products find");
        return repository.findAll();
    }

}
