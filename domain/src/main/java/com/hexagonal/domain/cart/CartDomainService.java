package com.hexagonal.domain.cart;

import com.hexagonal.domain.product.Product;
import com.hexagonal.domain.product.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class CartDomainService {
    private final CartRepository cartRepository;

    public CartDomainService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public void save(Product product) {
        cartRepository.save(product);
    }
}
