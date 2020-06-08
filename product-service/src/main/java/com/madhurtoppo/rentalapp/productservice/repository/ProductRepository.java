package com.madhurtoppo.rentalapp.productservice.repository;

import com.madhurtoppo.rentalcommons.model.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
