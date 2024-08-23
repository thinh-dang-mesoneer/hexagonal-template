package com.hexagonal.core.ports.out.persistent;

import com.hexagonal.core.models.Cart;

import java.util.Optional;

public interface CartRepository {
    Optional<Cart> findById(Long id);
    void save(Cart cart);
}