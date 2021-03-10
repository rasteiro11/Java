package com.oracle.titico03;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Shop {

	public static void main(String[] args) {
		ProductManager pm = new ProductManager();
		Product p1 = pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99), Rating.THREE_STAR);
		Product p2 = pm.createProduct(102, "Coffee", BigDecimal.valueOf(1.99), Rating.FOUR_STAR);
		Product p3 = pm.createProduct(103, "Cake", BigDecimal.valueOf(3.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
		Product p4 = pm.createProduct(105, "Cookie", BigDecimal.valueOf(3.99), Rating.ONE_STAR, LocalDate.now());
		Product p5 = p3.applyRating(Rating.FIVE_STAR);
		Product p6 = pm.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99), Rating.FIVE_STAR);
		Product p7 = pm.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
		Product p8 = p4.applyRating(Rating.FIVE_STAR);
		Product p9 = p1.applyRating(Rating.FIVE_STAR);
		System.out.println(p6.equals(p7));
		
//		System.out.println(p1.getBestBefore());
//		System.out.println(p3.getBestBefore());
//		p2.getBestBefore();
		
		
//		if(p3 instanceof Food) {
//			LocalDate bestbefore = ((Food)p3).getBestBefore();
//		}
		

		/*
		p1.setId(101);
		p1.setName("Tea");
		p1.setPrice(BigDecimal.valueOf(1.99));
		*/
		System.out.println(p1.toString());
		System.out.println(p1.getDiscount());
		System.out.println(p1.getRating());
		
		System.out.println(p2.toString());
		System.out.println(p2.getDiscount());
		System.out.println(p2.getRating());
		
		System.out.println(p3.toString());
		System.out.println(p3.getDiscount());
		System.out.println(p3.getRating());
		
		System.out.println(p4.toString());
		System.out.println(p4.getDiscount());
		System.out.println(p4.getRating());
		
		System.out.println(p5.toString());
		System.out.println(p5.getDiscount());
		System.out.println(p5.getRating());
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		
		
		

	}

}
