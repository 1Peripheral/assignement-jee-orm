package com.peripheral.productsapp.controllers;

import com.peripheral.productsapp.Entities.Product;
import com.peripheral.productsapp.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.rmi.ServerException;
import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts() {
       return new ResponseEntity<>(productRepository.findAll(), HttpStatus.OK);
    }
    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        Product product = productRepository.findById(id).orElse(null);
        if (product == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @PostMapping("/products" )
    public ResponseEntity<Product> addProduct(@RequestBody Product newProduct) {
        Product product  = productRepository.save(newProduct);
        return new ResponseEntity<>(product, HttpStatus.CREATED);
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<Product> deleteProduct(@PathVariable Long id) {
        Product product = productRepository.findById(id).orElse(null);
        if (product == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        productRepository.delete(product);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }
}
