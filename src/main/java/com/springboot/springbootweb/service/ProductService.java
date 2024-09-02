package com.springboot.springbootweb.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.springbootweb.model.Product;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(
                                        new Product(1, "Mobile", 1000.00f),
                                        new Product(2, "Laptop", 2000.00f),
                                        new Product(3, "TV", 3000.00f)
                                        );

    public List<Product> getProducts() {
        return products;
    }

}
