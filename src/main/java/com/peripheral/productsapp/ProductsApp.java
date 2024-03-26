package com.peripheral.productsapp;

import com.peripheral.productsapp.Entities.Product;
import com.peripheral.productsapp.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductsApp implements CommandLineRunner {
	@Autowired
	private ProductRepository productRepository;
	public static void main(String[] args) {
		SpringApplication.run(ProductsApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		productRepository.save(new Product("Laptop", 5000, 4));
		productRepository.save(new Product("Camera", 300, 3));
		productRepository.save(new Product("Smartphone", 5000, 10));

		productRepository.findAll().forEach(System.out::println);
		Product product = productRepository.findById(1L).get();
		System.out.println("===============");
		System.out.println(product);
	}
}
