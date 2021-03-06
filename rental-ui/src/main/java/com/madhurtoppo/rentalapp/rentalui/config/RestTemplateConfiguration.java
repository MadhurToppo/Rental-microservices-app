package com.madhurtoppo.rentalapp.rentalui.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/***
 * @author Madhur Toppo
 * @since 15th March 2020
 */
@Configuration
public class RestTemplateConfiguration {

    @Bean
    @LoadBalanced
    RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
