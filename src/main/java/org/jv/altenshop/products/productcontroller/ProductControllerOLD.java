package org.jv.altenshop.productcontroller.impl;

import java.util.List;
import java.util.Optional;

import org.jv.altenshop.entities.Product;
import org.jv.altenshop.productcontroller.ProductCrudServices;
import org.jv.altenshop.productrepository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductControllerImpl implements ProductCrudServices {
	
	private static final Logger logger = LoggerFactory.getLogger(ProductControllerImpl.class);
	
	@Autowired
    private ProductRepository productRepository;
	
	@GetMapping("/")
	public String pong() {
		return "Réponse du serveur : " + HttpStatus.OK.name();
	}
	
	/**
	 * Create a new product.
	 */
	@PostMapping("/products")
	@Override
	public ResponseEntity<Product> createProduct(@RequestBody Product product) {
		logger.info("New product : " + product);
		Product newProduct = this.productRepository.save(product);
		return new ResponseEntity<Product>(newProduct, HttpStatus.CREATED);
	}
	
	/**
	 * Retrieve all products.
	 */
	@GetMapping("/products")
	@Override
	public ResponseEntity<List<Product>> getAllProducts() {
		List<Product> allProducts = this.productRepository.findAll();
		return new ResponseEntity<List<Product>>(allProducts, HttpStatus.FOUND);
	}
	
	/**
	 * Retrieve details for product 1.
	 */
	@GetMapping("/products/1")
	@Override
	public ResponseEntity<Product> getProduct1() {
		Optional<Product> product1 = this.productRepository.findById(1);
		
		if (product1.isEmpty()) {
			throw new IllegalStateException("Product 1 not found !");
		}
		
		logger.info("Product1 : " + product1);
		
		return new ResponseEntity<Product>(product1.get(), HttpStatus.FOUND);
	}
	
	/**
	 * Update details of product 1 if it exists.
	 */
	@PatchMapping("/products/1")
	@Override
	public ResponseEntity<Product> updateProduct1(@RequestBody Product product1) {
		logger.info("Attempt to update product 1...");
		Product updatedProduct = this.productRepository.save(product1);
		return new ResponseEntity<Product>(updatedProduct, HttpStatus.OK);
	}
	
	/**
	 * Delete product 1.
	 */
	@DeleteMapping("/products/1")
	@Override
	public ResponseEntity<Void> deleteProduct1() {
		logger.info("Attempt to delete product 1...");
		this.productRepository.deleteById(1);
		return new ResponseEntity<Void>(HttpStatus.GONE);
	}
	
	/**
	 * Delete product by id.
	 */
	@DeleteMapping("/products")
	@Override
	public ResponseEntity<Void> deleteProduct(@RequestParam(value = "id", required = true) Integer productId) {
		logger.info("Attempt to delete product #" + productId + "...");
		this.productRepository.deleteById(productId);
		return new ResponseEntity<Void>(HttpStatus.GONE);
	}
	
}
