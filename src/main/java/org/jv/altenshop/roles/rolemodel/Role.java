package org.jv.altenshop.roles.rolemodel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Role {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable=false)
	@Enumerated(EnumType.STRING)
	private RoleEnum roleEnum;
	
	public Role() {
		super();
	}
	
	public Role(RoleEnum roleEnum) {
		super();
		this.roleEnum = roleEnum;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public RoleEnum getRoleEnum() {
		return roleEnum;
	}
	
	public void setRoleEnum(RoleEnum roleEnum) {
		this.roleEnum = roleEnum;
	}
	
	@Override
	public String toString() {
//		return "Role [id=" + this.id + ", roleEnum=" + this.roleEnum + "]";
		return this.roleEnum.toString();
	}
	
}
