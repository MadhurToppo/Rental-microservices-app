package com.madhurtoppo.rentalcommons.model.product;

import lombok.Data;
import javax.persistence.*;

/***
 * @author Madhur Toppo
 * @since 15th March 2020
 */
@Entity
@Table(name = "Product")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int productId;

    private String make;
    private String model;
    private String type;
    private String category;
    private int year;

}