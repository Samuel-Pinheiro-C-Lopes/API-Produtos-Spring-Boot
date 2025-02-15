package br.com.cadastro.domain;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
// Entity that will represent the products from the project
public class Product implements Serializable {
	
	// Static constant serialization shared across all products
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Integer amount;
	private Double price;
	
	// Constructors
	
	// Empty
	public Product() {
		
	}
	
	// Full
	public Product(Integer id, String name, Integer amount, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.price = price;
	}
	
	// Hash
	
	@Override
	public int hashCode() {
		return Objects.hash(amount, id, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(amount, other.amount) && Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(price, other.price);
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", amount=" + amount + ", price=" + price + "]";
	}

	// Getters and Setters
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
}
