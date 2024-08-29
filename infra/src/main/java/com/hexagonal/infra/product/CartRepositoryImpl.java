package com.hexagonal.infra.product;

import com.hexagonal.domain.cart.CartRepository;
import com.hexagonal.domain.product.Product;
import com.hexagonal.domain.product.ProductRepository;
import org.springframework.stereotype.Repository;

@Repository
public class CartRepositoryImpl implements CartRepository {

    @Override
    public void save(Product product) {
        System.out.println("CartRepositoryImpl.save");
    }
}
