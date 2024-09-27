package com.untilspring.startspring.controller;

import com.untilspring.startspring.models.Product;
import com.untilspring.startspring.services.Productservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private Productservices productservices;
    @GetMapping
    public List<Product> getAllProducts() {
     return productservices.getAllProducts();
    }

    @GetMapping("/products/category")
    public List<Map<String, Object>> getCategoryProducts() {
        return Arrays.asList(
                Map.of("name", "Product 3", "Price", 234),
                Map.of("name", "Product 4", "Price", 123)
        );
    }
}