package com.hexagonal.infra.product;

import com.hexagonal.domain.product.Product;
import com.hexagonal.domain.product.ProductRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    @Override
    public void save() {
        System.out.println("ProductRepositoryImpl.save");
    }

    @Override
    public Product findById(Long id) {
        System.out.println("ProductRepositoryImpl.findById");
        return null;
    }
}
