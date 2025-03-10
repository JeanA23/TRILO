package com.trotti.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trotti.api.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
