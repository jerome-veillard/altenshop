package org.jv.altenshop.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * Product entity.
 */
@Entity
public class Product implements Serializable {
    
	private static final long serialVersionUID = 3593826873538083186L;
	
	@Id
    private long id;
    
    private String code;
    
	private String name;
    
    private String description;
    
    private String inventoryStatus;
    
    private String category;
    
    private String image;
    
    private float price;
    
    private int quantity;
    
    private int rating;
    
    public Product() {
    	super();
    }
    
	public Product(String code, String name, String description, String inventoryStatus, String category, String image, float price, int quantity, int rating) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.inventoryStatus = inventoryStatus;
        this.category = category;
        this.image = image;
        this.price = price;
        this.quantity = quantity;
        this.rating = rating;
    }
	
    public long getId() {
        return id;
    }
    
    public String getCode() {
		return code;
	}

    public void setCode(String code) {
		this.code = code;
	}
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getInventoryStatus() {
		return inventoryStatus;
	}
	
	public void setInventoryStatus(String inventoryStatus) {
		this.inventoryStatus = inventoryStatus;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getImage() {
		return image;
	}
	
	public void setImage(String image) {
		this.image = image;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getRating() {
		return rating;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(category, other.category) && Objects.equals(code, other.code)
				&& Objects.equals(description, other.description) && id == other.id
				&& Objects.equals(image, other.image) && Objects.equals(inventoryStatus, other.inventoryStatus)
				&& Objects.equals(name, other.name) && Float.floatToIntBits(price) == Float.floatToIntBits(other.price)
				&& quantity == other.quantity && rating == other.rating;
	}
	
    @Override
	public int hashCode() {
		return Objects.hash(category, code, description, id, image, inventoryStatus, name, price, quantity, rating);
	}
    
	@Override
	public String toString() {
		return "Product [id=" + id + ", code=" + code + ", name=" + name + ", description=" + description
				+ ", inventoryStatus=" + inventoryStatus + ", category=" + category + ", image=" + image + ", price="
				+ price + ", quantity=" + quantity + ", rating=" + rating + "]";
	}
    
}