package org.jv.altenshop;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.jv.altenshop.orders.ordermodel.Order;
import org.jv.altenshop.orders.orderservice.OrderService;
import org.jv.altenshop.products.productmodel.Product;
import org.jv.altenshop.products.productservice.ProductService;
import org.jv.altenshop.roles.rolemodel.Role;
import org.jv.altenshop.roles.rolemodel.RoleEnum;
import org.jv.altenshop.roles.roleservice.RoleService;
import org.jv.altenshop.users.usermodel.User;
import org.jv.altenshop.users.userservice.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AltenshopApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AltenshopApplication.class, args);
		
//		RoleService roleService = context.getBean(RoleService.class);
//		UserService userService = context.getBean(UserService.class);
//		ProductService productService = context.getBean(ProductService.class);
//		OrderService orderService = context.getBean(OrderService.class);
//		
//		// *********** Create roles ***********
//		
//		// ADMIN
//		Role admin = new Role(RoleEnum.admin);
//		roleService.createRole(admin);
//		
//		// CUSTOMER
//		Role customer = new Role(RoleEnum.customer);
//		roleService.createRole(customer);
//		
//		
//		// *********** Create users ***********
//		
//		// USER 1
//		Set<Role> atRoles = new HashSet<Role>();
//		atRoles.add(admin);
//		atRoles.add(customer);
//		User at = new User("Super", "Dupont", "123", "super.dupont@email.com", atRoles);
//		userService.createUser(at);
//		
//		// USER 2
//		Set<Role> jsRoles = new HashSet<Role>();
//		jsRoles.add(customer);
//		User js = new User("Jane", "Smith", "456", "jane.smith@email.com", jsRoles);
//		userService.createUser(js);
//		
//		// USER 3
//		Set<Role> jdRoles = new HashSet<Role>();
//		jdRoles.add(customer);
//		User jd = new User("John", "Doe", "789", "john.doe@email.com", jdRoles);
//		userService.createUser(jd);
//		
//		// Products
//		
//		// *********** Create orders ***********
//		
//		Order order1 = new Order(77895, LocalDate.now());
//		js.addOrder(order1);
//		// Add products
//		Product product1 = new Product(
//				1,
//				"xx57lrf37", 
//				"Red T-Shirt", 
//				"Product Description", 
//				"INSTOCK", 
//				"Clothing", 
//				"red-t-shirt.jpg", 
//				29, 
//				20, 
//				5);
//		productService.createProduct(product1);
//		Product product2 = new Product(
//				2,
//				"xx57lrf37", 
//				"Brown T-Shirt", 
//				"Product Description", 
//				"INSTOCK", 
//				"Clothing", 
//				"brown-t-shirt.jpg", 
//				34, 
//				24, 
//				3);
//		productService.createProduct(product2);
//		order1.addProduct(product1);
//		order1.addProduct(product2);
//		orderService.createOrder(order1);
//		
//		Order order2 = new Order(44678, LocalDate.now());
//		js.addOrder(order2);
//		orderService.createOrder(order2);
//		
//		Order order3 = new Order(22456, LocalDate.now());
//		jd.addOrder(order3);
//		orderService.createOrder(order3);
//		
//		// Retrieve and print saved users (optional)
//		System.out.println("Saved users:");
//		userService.readAllUsers().forEach(System.out::println);
		
	}

}
