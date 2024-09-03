package com.hexagonal.bootstrap;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/hello")
    @PreAuthorize("hasAnyRole('DCC_ADMIN','DCC_ACCOUNTING','DCC_CONGRESS_MANAGER')")
    public String test() {
        return "Hello World";
    }
}
