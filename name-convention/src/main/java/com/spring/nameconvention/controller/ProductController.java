package com.spring.nameconvention.controller;
//package name should start with small letter
//If the name contains multiple words, it should be separated by dots (.) such as java.util, java.lang.


import com.spring.nameconvention.dto.ProductDTO;
import com.spring.nameconvention.entity.Product;
import com.spring.nameconvention.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {        //Class Name Should start with Capital Letter

    @Autowired
    private ProductService productService;

    // Get all products
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    // Get a single product by id
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        Product product = productService.getProductById(id);
        return ResponseEntity.ok(product);
    }

    //Method convention
    //It should start with lowercase letter.
    //It should be a verb such as main(), print().
    // Create a new product
    @PostMapping("/new")
    public String create(@RequestBody Product productData){
        String id = productService.create(productData);
        return id;
    }

    // Update an existing product
    @PutMapping("/{id}")
    public String update(@PathVariable int id,@RequestBody ProductDTO productDTO){
        return productService.update(id,productDTO);
    }

    // Delete a product
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        String ids = productService.delete(id);
        return ids;
    }
}

