package com.oracle.titico03;

public class Practice21 {
	public static void main(String[] args) {
		byte x = 2, y = 3, z = 5;
		
		z = (byte) (x + y);
		System.out.println(z);
		
		float a = (float)x / y;
		System.out.println(a);
		
		double b = (double)x/y;
		System.out.println(b);
		
		b = a; // converting a double(64bit) to an float(32bit)
		System.out.println(b);
		
		float c = Math.round(b*1000)/1000F;
		System.out.println(c);
		
		char a1 = 'a', a2='\141', a3='\u0061';
		System.out.println(""+a1+"\n"+a2+"\n"+a3);
		
		int i1 = 0141, i2=0x61;
		System.out.println(""+i1+"\n"+i2);
		
		char a4 = (char) i1;
		System.out.println(a4);
		
		char someChar = 'k';
		boolean isEven = (someChar%2==0);
		System.out.println(isEven);
		
		someChar = 'k';
		char nextChar = (char) (someChar + 1);
		System.out.println(nextChar);
		
		
		// increment and decrement operators do not need to cast the variable
		someChar = 'b';
		System.out.println(--someChar);
		System.out.println(++someChar);
		
		char upperA = 'A', lowerA = 'a';
		int distance = lowerA - upperA;
		System.out.println(distance);
		
		someChar = 'h';
		char upperSomeChar = (char)(someChar-32);
		System.out.println(upperSomeChar);
		
		
		
		
		
		
		
		}
}
