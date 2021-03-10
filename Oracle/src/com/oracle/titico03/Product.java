package com.oracle.titico03;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Objects;

public abstract class Product implements Rateable<Product>{
	private static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);
	
	private int id;
	
	private String name;
	
	private BigDecimal price;
	
	private Rating rating;
	
	Product() {
		this(0, "no name", BigDecimal.ZERO);
	}
	
	Product(int id, String name, BigDecimal price, Rating rating) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.rating = rating;
	}
	Product(int id, String name, BigDecimal price) {
		this(id, name, price, Rating.NOT_RATED);
	}

	public BigDecimal getDiscount() {
		return price.multiply(DISCOUNT_RATE).setScale(2, RoundingMode.HALF_UP);
	}
	
	public int getId() {
		return id;
	}
	
//	public void setId(final int id) {
//		this.id = id;
//	}
	
	public String getName() {
		return name;
	}
	
//	public void setName(final String name) {
//		this.name = name;
//	}
	
	public BigDecimal getPrice() {
		return price;
	}
	
//	public void setPrice(final BigDecimal price) {
	//	price = BigDecimal.ONE; // you can not reassign a final variable
	//	this.price = price;
	//}
	@Override
	public Rating getRating() {
		return rating;
	}
	
	//public abstract Product applyRating(Rating newRating); //{
//		return new Product(this.id, this.name, this.price, newRating);
//	}
	
	@Override
	public int hashCode() {
		int hash = 5;
		hash = 23 * hash + this.id;
		return hash;
	}
	@Override 
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(getClass() != obj.getClass()) {
			return false;
		}
		final Product other = (Product) obj;
		if(this.id != other.id) {
			return false;
		}
		if(!Objects.equals(this.name,  other.name)) {
			return false;
		}
		return true;
	}
	public LocalDate getBestBefore(){
		return  LocalDate.now();
	}
	

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price +"]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
