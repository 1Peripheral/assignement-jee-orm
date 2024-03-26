package com.peripheral.productsapp.Repository;

import com.peripheral.productsapp.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
