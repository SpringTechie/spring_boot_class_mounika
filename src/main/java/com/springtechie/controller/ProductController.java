package com.springtechie.controller;

import com.springtechie.entity.Product;
import com.springtechie.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/save-product")
    public String saveProduct(@RequestBody Product product) {
       return productService.saveProduct(product);
    }
}
