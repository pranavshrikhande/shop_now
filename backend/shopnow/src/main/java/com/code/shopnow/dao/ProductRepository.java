package com.code.shopnow.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code.shopnow.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
