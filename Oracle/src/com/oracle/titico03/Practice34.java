package com.oracle.titico03;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Practice34 {
	public static void main(String[] args) {
		
		Locale locale = Locale.FRANCE;
		
		ResourceBundle msg = ResourceBundle.getBundle("messages", locale);
		
		String offerPattern = msg.getString("offer");
		//return message.properties file
		
		
	//	MessageFormat.format(offerPattern, teaTxt, priceTxt, rateTxt, timeTxt);
		
		
	}
}
