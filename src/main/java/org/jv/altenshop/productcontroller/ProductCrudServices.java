package org.jv.altenshop.productcontroller;

import java.util.List;

import org.jv.altenshop.entities.Product;
import org.springframework.http.ResponseEntity;

/**
 * Provides CRUD services for Product entity.
 */
public interface ProductCrudServices {
	
	ResponseEntity<Product> createProduct(Product product);
    
	ResponseEntity<List<Product>> getAllProducts();
	
	ResponseEntity<Product> getProduct1();
	
	ResponseEntity<Product> updateProduct1(Product product1);
	
    ResponseEntity<Void> deleteProduct1();
    
    ResponseEntity<Void> deleteProduct(Integer productId);
    
}
