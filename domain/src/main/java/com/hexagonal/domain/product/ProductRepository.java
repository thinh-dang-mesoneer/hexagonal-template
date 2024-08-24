package com.hexagonal.domain.product;

public interface ProductRepository {
    void save();
    Product findById(Long id);
}
