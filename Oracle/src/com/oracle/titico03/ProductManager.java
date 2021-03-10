package com.oracle.titico03;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.ResourceBundle;

public class ProductManager {
	
	private Locale locale;
	private  ResourceBundle resources;
	private DateTimeFormatter dateFormat;
	private NumberFormat moneyFormat;	
	
	
	
	
	
	
	
	private Product product;
	private Review review;
	
	public Product createProduct(int id, String name, BigDecimal price, Rating rating, LocalDate bestBefore) {
		product = new Food(id, name, price, rating, bestBefore);
		return product;
	}
	
	public Product createProduct(int id, String name, BigDecimal price, Rating rating) {
		product = new Drinks(id, name, price, rating);
		return product;
	}
	
	public Product reviewProduct(Product product, Rating rating, String comments) {
		review = new Review(rating, comments);
		this.product = product.applyRating(rating);
		return this.product;
	}
	
	
	
	
	
	
	
}
