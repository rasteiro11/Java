package com.oracle.titico03;

public class Practice22 {
	public static void main(String[] args) {
		char someChar = 'q';
		if(someChar >= 'a' && someChar <= 'z') {
			someChar -= 32; //turn someChar to uppercase
		}else {
			if(someChar >= 'A' && someChar <= 'Z') {
				someChar += 32; //turn someChar to lowercase
			}
		}
		
		System.out.println(someChar);
		
		someChar = 'Q';
		someChar = (someChar >= 'a' && someChar <= 'z') ? (char) (someChar-32) : (char) (someChar+32);
		System.out.println(someChar);
		
		int period = 4;
		float amount = 10;
		float  rate = 0.05F;
		
		switch (period) {
		case 4:
			amount += amount * 0.2F;
			break;
			case 3:
				amount += amount * rate;
			case 2:
				amount += amount * rate;
			case 1:
				amount += amount * rate;
		}
		
		System.out.println(amount);
		
		
	}
}
