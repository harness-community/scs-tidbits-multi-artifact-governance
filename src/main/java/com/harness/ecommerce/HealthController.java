package com.harness.ecommerce;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HealthController {

    @GetMapping("/")
    public Map<String, String> home() {
        return Map.of(
            "app", "Harness E-Commerce App",
            "status", "running",
            "version", "1.0.0"
        );
    }
}
