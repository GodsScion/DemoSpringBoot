package com.springboot.springbootweb.service;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.springboot.springbootweb.model.Product;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>( Arrays.asList(
                                        new Product(1, "Mobile", 1000.00f),
                                        new Product(2, "Laptop", 2000.00f),
                                        new Product(3, "TV", 3000.00f)
                                        ));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProduct(int id) {
        return products.stream().filter(product -> product.getId() == id).findFirst().orElse(new Product(0, "Not Found", 0.0f));
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void deleteProduct(int id) {
        products.removeIf(product -> product.getId() == id);
    }

    public void updateProduct(Product product) {
        products.removeIf(p -> p.getId() == product.getId());
        products.add(product);
    }

}
