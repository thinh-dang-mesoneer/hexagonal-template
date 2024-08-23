package com.hexagonal.core.ports.in.rest;

import com.hexagonal.core.models.Cart;

public interface CartService {
    void addToCart(Long cartId, Long productId, int quantity);
    Cart getCart(Long cartId);
}
