package org.jv.altenshop.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.jv.altenshop.products.Product;

class ProductTest {
	
	@BeforeAll
    static void initAll() {
    }
	
	@BeforeEach
    void init() {
    }
	
	@Test
	void test() {
		
		// The equals method implements an equivalence relation. It is:
		
		Product product1 = new Product(
				"xx57lrf37", 
				"Red T-Shirt", 
				"Product Description", 
				"INSTOCK", 
				"Clothing", 
				"red-t-shirt.jpg", 
				29, 
				20, 	
				5);
		
		assertTrue(product1.equals(product1)); // Reflexivity test : for any non-null reference value x, x.equals(x) must return true.
		
		// Consistency test : for any non-null reference values x and y, multiple invocations of x.equals(y) consistently return true or consistently return false, provided no information used in equals comparisons on the objects is modified.
		
		assertFalse(product1.equals(null)); // For any non-null reference value x, x.equals(null) must return false.
		
		Product product1Clone = product1.clone();
		assertNotSame(product1, product1Clone); // Identity test
		assertEquals(product1, product1Clone); // Equality test
		
		assertEquals(product1Clone, product1); // Symmetry test : for any non-null reference values x and y, x.equals(y) must return true if and only if y.equals(x) returns true.
		
		Product product1Clone2 = product1.clone();
		assertEquals(product1, product1Clone2); // Transitivity test : for any non-null reference values x, y, z, if x.equals(y) returns true and y.equals(z) returns true, then x.equals(z) must return true.
		
	}

	@AfterEach
    void tearDown() {
    }

    @AfterAll
    static void tearDownAll() {
    }
	
}
