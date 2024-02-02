package com.spring.nameconvention.service;

import com.spring.nameconvention.dto.ProductDTO;
import com.spring.nameconvention.entity.Product;
import com.spring.nameconvention.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public String create(Product productData) {
        Product savedProduct = productRepository.save(productData);
        return "Product added successfully with ID: " + savedProduct.getId();
    }

    public String delete(long id) {
        try {
            productRepository.deleteById(id);
            return "Product deleted successfully.";
        } catch (EmptyResultDataAccessException e) {
            return "Product not found with ID: " + id;
        } catch (Exception e) {
            return "Error deleting product with ID: " + e;
        }
    }

    public String update(long id, ProductDTO productDTO) {
        if (productRepository.existsById(id)) {
            Product existingProduct = productRepository.getOne(id);
            existingProduct.setName(productDTO.getName() != null ? productDTO.getName() : existingProduct.getName());
            existingProduct.setPrice(productDTO.getPrice() != null ? productDTO.getPrice() : existingProduct.getPrice());
            productRepository.save(existingProduct);
            return "Product updated successfully.";
        } else {
            return "Product with ID " + id + " does not exist.";
        }
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(long id) {
        return productRepository.findById(id).orElse(null);
    }
}
