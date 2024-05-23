package org.jv.altenshop.users.userservice;

import java.util.Optional;

import org.jv.altenshop.users.usermodel.User;
import org.jv.altenshop.users.userrepository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class UserServiceImpl implements UserService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void createUser(User user) {
		this.userRepository.save(user);
	}
	
	@Override
	public Iterable<User> readAllUsers() {
		return this.userRepository.findAll();
	}
	
	@Override
	public Optional<User> readUserById(Integer id) {
		return this.userRepository.findById(id);
	}
	
	@Override
	public void deleteUser(Integer userId) {
		this.userRepository.deleteById(userId);
	}
	
	@Override
	public void deleteAllUsers() {
		this.userRepository.deleteAll();
	}
	
}
