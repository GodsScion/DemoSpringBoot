package com.godsscion.springh2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.godsscion.springh2.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {
}
