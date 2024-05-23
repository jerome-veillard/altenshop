package org.jv.altenshop.products.productservice;

import java.util.Optional;

import org.jv.altenshop.products.productmodel.Product;
import org.jv.altenshop.products.productrepository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
class ProductServiceImpl implements ProductService {

	private static final Logger logger = LoggerFactory.getLogger(ProductService.class);
	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Product createProduct(Product product) {
		return this.productRepository.save(product);
	}
	
	@Override
	public Iterable<Product> readAllProducts() {
		return this.productRepository.findAll();
	}
	
	@Override
	public Optional<Product> readProductById(Integer id) {
		return this.productRepository.findById(id);
	}
	
	@Override
	public Product updateProduct(Integer productId, Product product) {
		Optional<Product> productFromDbOpt = this.productRepository.findById(productId);
		
		if (productFromDbOpt.isEmpty()) {
			throw new IllegalStateException("Product " + productId + " not found !");
		}
		
		Product productFromDb = productFromDbOpt.get();
		
		logger.info("Product from DB : " + productFromDb);
		
		// Field to field copy
		productFromDb.setCode(product.getCode());
		productFromDb.setName(product.getName());
		productFromDb.setDescription(product.getDescription());
		productFromDb.setImage(product.getImage());
		productFromDb.setPrice(product.getPrice());
		productFromDb.setCategory(product.getCategory());
		productFromDb.setQuantity(product.getQuantity());
		productFromDb.setInventoryStatus(product.getInventoryStatus());
		productFromDb.setRating(product.getRating());
		
		return this.productRepository.save(productFromDb);
	}
	
	@Override
	public void deleteProduct(Integer productId) {
		this.productRepository.deleteById(productId);
	}
	
	@Override
	public void deleteAllProducts() {
		this.productRepository.deleteAll();
	}
	
	@Override
	public boolean checkIfIdExists(Integer id) {
		return this.productRepository.existsById(id);
	}
	
}
