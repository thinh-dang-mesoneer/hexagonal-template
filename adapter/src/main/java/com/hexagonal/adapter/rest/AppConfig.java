package com.hexagonal.adapter.rest;

import com.hexagonal.core.ports.in.rest.CartService;
import com.hexagonal.core.services.cart.CartServiceImpl;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AppConfig {

    @Bean
    CartService cartService() {
        return new CartServiceImpl();
    }
}
