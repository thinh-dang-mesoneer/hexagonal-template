package com.hexagonal.adapter.rest.product;

import com.hexagonal.core.ports.in.rest.CartService;
import com.hexagonal.core.services.cart.CartServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @PostMapping("/test")
    public String test() {
        return "Test";
    }
}
