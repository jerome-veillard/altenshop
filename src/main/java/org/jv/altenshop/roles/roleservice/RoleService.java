package org.jv.altenshop.roles.roleservice;

import java.util.Optional;

import org.jv.altenshop.roles.rolemodel.Role;

/**
 * CRUD services.
 */
public interface RoleService {
	
	/**
	 * CREATE.
	 */
	void createRole(Role role);
	
	/**
	 * READ all.
	 */
	Iterable<Role> readAllRoles();
	
	/**
	 * READ by id.
	 */
	Optional<Role> readRoleById(Integer id);
	
	// TODO : UPDATE of an existing role.
	
	/**
	 * DELETE by id.
	 */
	void deleteRole(Integer roleId);
	
	/**
	 * DELETE all.
	 */
	void deleteAllRoles();
	
}
