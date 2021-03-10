package com.oracle.titico03;

import java.math.BigDecimal;
import java.time.LocalTime;

public final class Drinks extends Product{

	Drinks(int id, String name, BigDecimal price, Rating rating) {
		super(id, name, price, rating);
	}
	
	@Override 
	public BigDecimal getDiscount() {
		LocalTime now = LocalTime.now();
		return (now.isAfter(LocalTime.of(17, 30)) && now.isBefore(LocalTime.of(18, 30))) ? super.getDiscount() : BigDecimal.ZERO;			
	}
	
	@Override
	public Product applyRating(Rating newRating) {
		return new Drinks(getId(), getName(), getPrice(), newRating);
	}
	
	
	
}
