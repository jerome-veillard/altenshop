package org.jv.altenshop.orders.ordermodel;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.jv.altenshop.products.productmodel.Product;
import org.jv.altenshop.users.usermodel.User;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
	
	private Integer number;
	
//	private LocalDate date;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="user_id", nullable=false)
    private User user;
	
	@ManyToMany(fetch = FetchType.EAGER)
	private Set<Product> products = new HashSet<Product>();
	
	public Order() {
		super();
	}
	
	public Order(Integer number, LocalDate date) {
		super();
		this.number = number;
//		this.date = date;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getNumber() {
		return number;
	}
	
	public void setNumber(Integer number) {
		this.number = number;
	}
	
//	public LocalDate getDate() {
//		return date;
//	}
//	
//	public void setDate(LocalDate date) {
//		this.date = date;
//	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}

	public void addProduct(Product product) {
		this.products.add(product);
	}
	
	public void removeProduct(Product product) {
		this.products.remove(product);
	}
	
	@Override
	public String toString() {
		return "Order [id=" + this.id + ", number=" + this.number + ", user with email=" + this.user.getEmail() + this.products + "]";
	}
	
}
