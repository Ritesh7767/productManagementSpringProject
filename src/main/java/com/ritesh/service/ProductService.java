package com.ritesh.service;

import com.ritesh.entity.Product;
import com.ritesh.repository.ProductRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public void save(Product product){
        productRepository.save(product);
    }

    public Product findById(int id){
        return productRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Product not found with the provided id"));
    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product updateProduct(int id, Product newProduct){
        Product product = productRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Product not found with the provided id"));
        product.setName(newProduct.getName());
        product.setBrand(newProduct.getBrand());
        product.setPrice(newProduct.getPrice());
        productRepository.save(product);
//        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Something went wrong while updating the product, please try again"));
        return product;
    }

    public void deleteProduct(int id){
        productRepository.deleteById(id);
    }
}
