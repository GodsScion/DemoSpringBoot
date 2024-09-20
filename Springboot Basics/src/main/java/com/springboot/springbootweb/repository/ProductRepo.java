package com.springboot.springbootweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.springbootweb.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
