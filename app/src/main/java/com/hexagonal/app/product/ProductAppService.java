package com.hexagonal.app.product;

import com.hexagonal.domain.product.ProductDomainService;
import org.springframework.stereotype.Service;

import java.io.Serial;

@Service
public class ProductAppService {
    private final ProductDomainService productDomainService;

    public ProductAppService(ProductDomainService productDomainService) {
        this.productDomainService = productDomainService;
    }

    public void save() {
        productDomainService.save();
    }
}
