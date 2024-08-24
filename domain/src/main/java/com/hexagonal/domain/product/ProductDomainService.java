package com.hexagonal.domain.product;

import org.springframework.stereotype.Service;

@Service
public class ProductDomainService {
    private final ProductRepository productRepository;

    public ProductDomainService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void save() {
        productRepository.save();
    }

    public Product findById(Long id) {
        return productRepository.findById(id);
    }
}
