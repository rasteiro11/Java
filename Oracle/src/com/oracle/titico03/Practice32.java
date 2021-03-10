package com.oracle.titico03;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class Practice32 {
	public static void main(String[] args) {
		
		double price = 1.85;
		double rate = 0.065;
		price -= price*rate;
		price = Math.round(price*100)/100.0;
		
		BigDecimal price1 = BigDecimal.valueOf(1.85);
		BigDecimal rate1 = BigDecimal.valueOf(0.065);
		
		price1 = price1.subtract(price1.multiply(rate1)).setScale(2, RoundingMode.HALF_UP);
		System.out.println(price1);
		
		Locale locale = Locale.FRANCE;
		
		NumberFormat percentFormat = NumberFormat.getPercentInstance(locale);
		percentFormat.setMaximumFractionDigits(2);
		String percentFormat1 = percentFormat.format(price1);
		System.out.println(percentFormat1);
		
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
		String currencyFormat1 = currencyFormat.format(rate1);
		System.out.println(currencyFormat1);
		
		System.out.println(locale);
		
		Locale locale1 = Locale.UK;
		NumberFormat currencyFormat2 = NumberFormat.getCurrencyInstance(locale1);
		NumberFormat percentFormat2 = NumberFormat.getPercentInstance(locale1);
		percentFormat.setMaximumFractionDigits(2);
		
		String priceTxt = currencyFormat2.format(price);
		String rateTxt = percentFormat2.format(rate);
		
		System.out.println(priceTxt+"\n"+rateTxt);
		
		
		
		
		
		
		
		
	}
}	
