package com.springtechie.service;

import com.springtechie.entity.Product;
import com.springtechie.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public String saveProduct(Product product) {
       productRepository.save(product);
       return "Saved Successfully";
    }
}
