package org.jv.altenshop.products.productrepository;

import org.jv.altenshop.products.productmodel.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Data repository for Product entity.
 * Creation / update (coarse-grained) / deletion operations are delegated directly to Spring Data JPA.
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {}
