package org.jv.altenshop.products.productcontroller;

import java.util.Optional;

import org.jv.altenshop.products.Product;
import org.jv.altenshop.products.productservice.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
    private ProductService productService;
	
	/**
	 * CREATE.
	 */
	@PostMapping(path="/products")
	public ResponseEntity<Product> createProduct(@RequestBody Product product) {
		logger.info("Attempt to CREATE : " + product);
		
		// TODO : existing product case
//		Product existingProduct = this.productService.getProductById();
//		if (existingProduct != null) {
//			return new ResponseEntity<Product>(HttpStatus.CONFLICT);
//		}
		
		this.productService.createProduct(product);
		
		logger.info("Product " + product.getId() + " created...");
		
		return new ResponseEntity<>(product, HttpStatus.CREATED);
	}
	
	/**
	 * READ all.
	 */
	@GetMapping(path="/products")
	public ResponseEntity<Iterable<Product>> getAllProducts() {
		logger.info("Attempt to GET all products...");
		
		Iterable<Product> allProducts = this.productService.readAllProducts();
		
		return new ResponseEntity<>(allProducts, HttpStatus.FOUND);
	}
	
	/**
	 * READ by ID.
	 */
	@GetMapping(path="/products/{productId}")
	public ResponseEntity<Product> getProduct(@PathVariable Integer productId) {
		logger.info("Attempt to GET product " + productId);
		
		Optional<Product> productOpt = this.productService.readProductById(productId);
		
		if (productOpt.isEmpty()) {
			throw new IllegalStateException("Product " + productId + " not found !");
		}
		
		return new ResponseEntity<>(productOpt.get(), HttpStatus.FOUND);
	}
	
	/**
	 * UPDATE details of product if it exists (fine-grained UPDATE).
	 */
	@PatchMapping("/products/{productId}")
	public ResponseEntity<Product> updateProduct(@PathVariable Integer productId, @RequestBody Product product) {
		logger.info("Attempt to UPDATE product " + productId);
		
		Product updatedProduct = this.productService.updateProduct(productId, product);
		
		return new ResponseEntity<Product>(updatedProduct, HttpStatus.OK);
	}
	
	/**
	 * DELETE by ID.
	 */
	@DeleteMapping(path="/products/{productId}")
	public ResponseEntity<Void> deleteProduct(@PathVariable Integer productId) {
		logger.info("Attempt to DELETE product " + productId);
		
		this.productService.deleteProduct(productId);
		
		return new ResponseEntity<Void>(HttpStatus.GONE);
	}
	
	/**
	 * DELETE all.
	 */
	@DeleteMapping(path="/products")
	public ResponseEntity<Void> deleteAllProducts() {
		logger.info("Attempt to DELETE all products...");
		
		this.productService.deleteAllProducts();
		
		logger.info("All products deleted...");
		
		return new ResponseEntity<Void>(HttpStatus.GONE);
	}
	
}
