package com.peripheral.productsapp.Repository;

import com.peripheral.productsapp.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByNameContains(String keyword);
    List<Product> findByPriceGreaterThan(double price);

    @Query("select id, name, price, quantity from Product where name like :x")
    List<Product> search(@Param("x") String keyword);
}
