import java.util.Scanner;

public class Aula_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//sc.next();		
		//int x = 5;	
		String h = "hello";
		h.length();
		
		tim("TITICO", 4);
		System.out.println(add2(1));
		System.out.println(excmark("hello"));
	}
	public static void tim(String str, int x) {
		for (int i = 0; i < x; i++) {		
		System.out.println(str);
		}
	}
	public static int add2(int x) {
		return x + 2; 
		}
	public static String excmark(String x) {
		return x + "!";
		}
	}

