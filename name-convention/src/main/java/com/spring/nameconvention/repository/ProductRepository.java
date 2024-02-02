package com.spring.nameconvention.repository;

import com.spring.nameconvention.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

//Interface names should be capitalized like class names.
public interface ProductRepository extends JpaRepository<Product, Long> {
}

