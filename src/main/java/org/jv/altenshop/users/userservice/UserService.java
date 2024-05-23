package org.jv.altenshop.users.userservice;

import java.util.Optional;

import org.jv.altenshop.users.usermodel.User;

/**
 * CRUD services for users.
 */
public interface UserService {
	
	/**
	 * CREATE new user.
	 */
	void createUser(User user);
	
	/**
	 * READ all users.
	 */
	Iterable<User> readAllUsers();
	
	/**
	 * READ user by id.
	 */
	Optional<User> readUserById(Integer id);
	
	// TODO : UPDATE of an existing user.
	
	/**
	 * DELETE user by id.
	 */
	void deleteUser(Integer userId);
	
	/**
	 * DELETE all users.
	 */
	void deleteAllUsers();
	
}
