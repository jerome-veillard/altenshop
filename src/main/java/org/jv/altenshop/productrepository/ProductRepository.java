package org.jv.altenshop.productrepository;

import org.jv.altenshop.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface d'accès aux données (DAO) pour la donnée Product.
 * Les opérations de création / mise à jour (gros grain) / suppression sont délégués directement aux fonctionnalités Spring Data JPA.
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {}
