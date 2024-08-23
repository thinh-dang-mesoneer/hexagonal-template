package com.hexagonal.core.ports.out.persistent;

import com.hexagonal.core.models.Product;

import java.util.Optional;

public interface ProductRepository {
    Optional<Product> findById(Long id);
}

