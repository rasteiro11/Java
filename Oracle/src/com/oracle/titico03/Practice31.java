package com.oracle.titico03;

public class Practice31 {

	public static void main(String[] args) {
		
	String teaTxt = "Tea";
	System.out.println(teaTxt+"\n");
	
	String b = "Tea";
	System.out.println(b+"\n");
		
	System.out.println(b == teaTxt); // return true
	
	String c = new String("Tea");
	System.out.println(c == teaTxt); // return false
	
	System.out.println(c.intern()); // return "Tea"
	
	System.out.println(teaTxt == c); //still return false
	
	String d = c.intern();
	
	System.out.println(teaTxt == d); // return true;
	
	c = teaTxt +' '+ b;
	System.out.println(c);
	
	System.out.println(c.indexOf('T'));
	System.out.println(c.indexOf('T', 1));
	System.out.println(c.lastIndexOf('T'));

	System.out.println(c.charAt(c.length()-1));
	System.out.println(c.length());
	
	System.out.println(c.toUpperCase());
	
	c = c.toUpperCase(); //STRINGS ARE IMMUTABLE
	System.out.println(c);
	
	System.out.println(c.substring(c.lastIndexOf('T'), c.lastIndexOf('T')+2));
	
	StringBuilder txt = new StringBuilder(c);
	System.out.println(txt.length());
	System.out.println(txt.capacity());
	
	System.out.println(txt.replace(0, 3, "What is the price of"));
	System.out.println(txt.length());
	System.out.println(txt.capacity());
	
	
	
	
	
	

		
		
		
		
		
	}
}
