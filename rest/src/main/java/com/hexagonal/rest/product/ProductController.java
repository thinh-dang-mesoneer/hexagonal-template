package com.hexagonal.rest.product;

import com.hexagonal.app.product.ProductAppService;
import com.hexagonal.domain.test.TestTable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductAppService productAppService;

    public ProductController(ProductAppService productAppService) {
        this.productAppService = productAppService;
    }

    @PostMapping("/save")
    public void save() {
        productAppService.save();
    }

    @PostMapping("/addToCart/{productId}")
    public void addToCart(Long productId) {
        productAppService.addToCart(productId);
    }

    @GetMapping("/{tenantId}/{id}")
    public Optional<TestTable> findById(@PathVariable String tenantId,@PathVariable Long id) {
//        SchemaResolver.setCurrentTenant(tenantId);
        return productAppService.findById(id);
    }

}
