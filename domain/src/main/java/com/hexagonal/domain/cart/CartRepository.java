package com.hexagonal.domain.cart;

import com.hexagonal.domain.product.Product;

public interface CartRepository {
    void save(Product product);
}
