package com.hexagonal.core.services.cart;

import com.hexagonal.core.models.Cart;
import com.hexagonal.core.models.CartItem;
import com.hexagonal.core.models.Product;
import com.hexagonal.core.ports.in.rest.CartService;
import com.hexagonal.core.ports.out.persistent.CartRepository;
import com.hexagonal.core.ports.out.persistent.ProductRepository;

public class CartServiceImpl implements CartService {
    private final ProductRepository productRepository;
    private final CartRepository cartRepository;

    public CartServiceImpl(ProductRepository productRepository, CartRepository cartRepository) {
        this.productRepository = productRepository;
        this.cartRepository = cartRepository;
    }

    @Override
    public void addToCart(Long cartId, Long productId, int quantity) {
        Cart cart = cartRepository.findById(cartId)
                .orElseThrow(() -> new RuntimeException("Cart not found"));
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        CartItem item = new CartItem(product, quantity);
        cart.addItem(item);
        cartRepository.save(cart);
    }

    @Override
    public Cart getCart(Long cartId) {
        return cartRepository.findById(cartId)
                .orElseThrow(() -> new RuntimeException("Cart not found"));
    }
}
