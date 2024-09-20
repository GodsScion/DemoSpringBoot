package com.godsscion.springh2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.godsscion.springh2.model.Product;
import com.godsscion.springh2.repo.ProductRepo;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepo repo;

    public List<Product> getProducts() {
        return repo.findAll();
    }

}
