package org.jv.altenshop.users.userrepository;

import org.jv.altenshop.users.usermodel.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Data repository for User entity.
 * Creation / update (coarse-grained) / deletion operations are delegated directly to Spring Data JPA.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {}