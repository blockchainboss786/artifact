package com.example.artifact.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.artifact.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>{

}
