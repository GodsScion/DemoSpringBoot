package com.godsscion.springh2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.godsscion.springh2.model.Product;
import com.godsscion.springh2.service.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;

    @RequestMapping("/")
    public String hello() {
        return "hello";
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }
    


}
