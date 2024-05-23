package org.jv.altenshop.orders.orderrepository;

import org.jv.altenshop.orders.ordermodel.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Data repository for Order entity.
 * Creation / update (coarse-grained) / deletion operations are delegated directly to Spring Data JPA.
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {}