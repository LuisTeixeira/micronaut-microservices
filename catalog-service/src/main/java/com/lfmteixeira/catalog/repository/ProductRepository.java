package com.lfmteixeira.catalog.repository;

import com.lfmteixeira.catalog.model.Product;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Singleton
public class ProductRepository {

    private List<Product> products;

    public ProductRepository() {
        this.products = new ArrayList<>();
    }

    public Product addProduct(Product product) {
        product.setId((long) products.size() + 1);
        products.add(product);
        return product;
    }

    public Product findById(Long id) {
        Optional<Product> product = products.stream().filter(a -> a.getId().equals(id)).findFirst();
        return product.isPresent() ? product.get() : null;
    }

    public List<Product> findAll() {
        return products;
    }

}
