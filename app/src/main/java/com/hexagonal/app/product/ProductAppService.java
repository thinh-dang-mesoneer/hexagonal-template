package com.hexagonal.app.product;

import com.hexagonal.domain.cart.CartDomainService;
import com.hexagonal.domain.product.Product;
import com.hexagonal.domain.product.ProductDomainService;
import com.hexagonal.domain.test.TestTable;
import com.hexagonal.domain.test.TestTableRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductAppService {
    private final ProductDomainService productDomainService;
    private final CartDomainService cartDomainService;
    private final TestTableRepository testTableRepository;

    public ProductAppService(ProductDomainService productDomainService, CartDomainService cartDomainService,
                             TestTableRepository testTableRepository) {
        this.productDomainService = productDomainService;
        this.cartDomainService = cartDomainService;
        this.testTableRepository = testTableRepository;
    }

    public void save() {
        productDomainService.save();
    }

//    @Transactional
    public void addToCart(Long productId) {
        Product product = productDomainService.findById(productId);
        cartDomainService.save(product);
    }

    public Optional<TestTable> findById(Long id) {
        return testTableRepository.findById(id);
    }
}
