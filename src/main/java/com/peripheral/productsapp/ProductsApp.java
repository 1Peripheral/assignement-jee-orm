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
		//productRepository.save(new Product("Laptop", 5000, 4));
		//productRepository.save(new Product("Camera", 300, 3));
		//productRepository.save(new Product("Smartphone", 2300, 10));

		// Afficher tous les produits
		productRepository.findAll().forEach(System.out::println);

		// Afficher un produit
		Product product = productRepository.findById(1L).get();
		System.out.println("===============");
		System.out.println("ID : " + product.getId());
		System.out.println("Name : " + product.getName());
		System.out.println("Price : " + product.getPrice());
		System.out.println("Quantity : " + product.getQuantity());

		// Rechercher un produit
		System.out.println("===============");
		productRepository.findByNameContains("L").forEach(System.out::println);
		System.out.println("===============");
		productRepository.findByPriceGreaterThan(1000);

		// Mettre a jour un produit
		System.out.println("===============");

	}
}
