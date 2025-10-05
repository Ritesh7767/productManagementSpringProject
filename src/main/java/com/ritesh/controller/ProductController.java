package com.ritesh.controller;

import com.ritesh.entity.Product;
import com.ritesh.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity<String> save(@RequestBody Product product){
        productService.save(product);
        return ResponseEntity.ok("Product saved");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable int id){
        throw new RuntimeException("just a dummy excepetion");
//        return ResponseEntity.ok(productService.findById(id));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Product>> findAll(){
        return ResponseEntity.ok(productService.findAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable int id, @RequestBody Product product){
        return ResponseEntity.ok(productService.updateProduct(id, product));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable int id){
        productService.deleteProduct(id);
        return ResponseEntity.ok("Product deleted successfully");
    }

}
