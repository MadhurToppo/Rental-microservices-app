package com.madhurtoppo.rentalapp.authorizationserver.repository;

import com.madhurtoppo.rentalapp.authorizationserver.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/***
 * @author Madhur Toppo
 * @since 15th March 2020
 */
public interface UserDetailRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(String name);

}
