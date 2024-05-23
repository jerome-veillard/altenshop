package org.jv.altenshop.roles.roleservice;

import java.util.Optional;

import org.jv.altenshop.roles.rolemodel.Role;
import org.jv.altenshop.roles.rolerepository.RoleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
	
	private static final Logger logger = LoggerFactory.getLogger(RoleService.class);
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public void createRole(Role role) {
		this.roleRepository.save(role);
	}
	
	@Override
	public Iterable<Role> readAllRoles() {
		return this.roleRepository.findAll();
	}
	
	@Override
	public Optional<Role> readRoleById(Integer id) {
		return this.roleRepository.findById(id);
	}
	
	@Override
	public void deleteRole(Integer roleId) {
		this.roleRepository.deleteById(roleId);
	}
	
	@Override
	public void deleteAllRoles() {
		this.roleRepository.deleteAll();
	}
	
}
