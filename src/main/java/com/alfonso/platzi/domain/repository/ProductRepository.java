package com.alfonso.platzi.domain.repository;

import com.alfonso.platzi.domain.Product;
import com.alfonso.platzi.persistence.CRUD.ProductoCrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> getAll();

    Optional<List<Product>> getByCategory(Long categoryId);

    Optional<List<Product>> getScarseProducts(Long quantity);

    Optional<Product> getProduct(Long productId);

    Product save(Product product);

    void delete(Long productId);

}
