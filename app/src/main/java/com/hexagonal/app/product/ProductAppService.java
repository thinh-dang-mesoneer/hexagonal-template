package com.hexagonal.app.product;

import com.hexagonal.domain.cart.CartDomainService;
import com.hexagonal.domain.product.Product;
import com.hexagonal.domain.product.ProductDomainService;
import org.springframework.stereotype.Service;

import java.io.Serial;

@Service
public class ProductAppService {
    private final ProductDomainService productDomainService;
    private final CartDomainService cartDomainService;

    public ProductAppService(ProductDomainService productDomainService, CartDomainService cartDomainService) {
        this.productDomainService = productDomainService;
        this.cartDomainService = cartDomainService;
    }

    public void save() {
        productDomainService.save();
    }

//    @Transactional
    public void addToCart(Long productId) {
        Product product = productDomainService.findById(productId);
        cartDomainService.save(product);
    }
}
