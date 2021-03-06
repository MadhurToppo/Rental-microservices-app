package com.madhurtoppo.rentalapp.productservice.service;

import com.madhurtoppo.rentalcommons.model.product.Product;

import java.util.List;

/***
 * @author Madhur Toppo
 * @since 15th March 2020
 */
public interface ProductService {

    Product save(Product product);

    Product fetchById(int productId);

    List<Product> fetchAllProducts();

    void delete(int id);
}
