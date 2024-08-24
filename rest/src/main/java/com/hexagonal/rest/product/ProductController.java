package com.hexagonal.rest.product;

import com.hexagonal.app.product.ProductAppService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
