package org.jv.altenshop.products.productservice;


import java.util.Optional;

import org.jv.altenshop.products.Product;

/**
 * CRUD services.
 */
public interface ProductService {
	
	/**
	 * CREATE.
	 */
	Product createProduct(Product product);
	
	/**
	 * Fine-grained UPDATE of an existing product.
	 */
	Product updateProduct(Integer productId, Product product);
    
    /**
	 * DELETE.
	 */
    void deleteProduct(Integer productId);

	/**
	 * DELETE all.
	 */
    void deleteAllProducts();
    
    /**
	 * READ by id.
	 */
    Optional<Product> readProductById(Integer id);
    
    /**
	 * READ all.
	 */
    Iterable<Product> readAllProducts();
    
    /**
	 * Check.
	 */
    boolean checkIfIdExists(Integer id);
    
}
