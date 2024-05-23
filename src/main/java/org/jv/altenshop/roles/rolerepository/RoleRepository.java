package org.jv.altenshop.roles.rolerepository;

import org.jv.altenshop.roles.rolemodel.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Data repository for Role entity.
 * Creation / update (coarse-grained) / deletion operations are delegated directly to Spring Data JPA.
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {}