import java.util.Scanner;
public class Aula_10 {
	public static void main(String[] args) {
		int[] arr = {1, 5, 7, 3, 4, 5};
		String[] names = new String[5];
		Scanner sc = new Scanner(System.in);
		//int count = 0;
		//for (int element:arr) {
			//System.out.println(element + " " + count);
			//count++;
		//}
		for (int i = 0; i < names.length; i++) {
			System.out.print("Input: ");
			String input = sc.nextLine();
			names[i] = input;
			//break;
		}
		for (String n:names) {
			System.out.println(n);
			if (n.equals("tim")) {
				break;
			}
		}
		
	}
}
