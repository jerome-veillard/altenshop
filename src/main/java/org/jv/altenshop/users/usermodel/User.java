package org.jv.altenshop.users.usermodel;

import java.util.HashSet;
import java.util.Set;

import org.jv.altenshop.orders.ordermodel.Order;
import org.jv.altenshop.roles.rolemodel.Role;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
	private String firstName;
	
	private String lastName;
	
	private String password;
	
	@Column(nullable=false)
	private String email;
	
	@ManyToMany(fetch = FetchType.EAGER)
	private Set<Role> roles = new HashSet<Role>();
	
	@OneToMany(mappedBy="user", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
	private Set<Order> orders = new HashSet<Order>();
	
	public User() {
		super();
	}
	
	public User(String firstName, String lastName, String password, String email,  Set<Role> roles) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = this.encrypt(password);
		this.email = email;
		this.roles = roles;
	}
	
	private String encrypt(String password) {
		// TODO : encryption logic
		return password;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Set<Role> getRoles() {
		return roles;
	}
	
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
	public Set<Order> getOrders() {
		return this.orders;
	}
	
	public void addOrder(Order order) {
		this.orders.add(order);
		order.setUser(this);
	}
	
	public void removeOrder(Order order) {
		this.orders.remove(order);
	}
	
	@Override
	public String toString() {
		return "User [id=" + this.id + ", " + this.firstName + " " + this.lastName + ", " + this.email + ", roles=" + this.roles + ", orders=" + this.orders + "]";
	}
	
}
