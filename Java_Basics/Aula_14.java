import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Aula_14 {
	public static void main(String[] args) {
		//Map m = new HashMap();
		//String str = "hello my name is tim and i am cool";
		
		//for (char x:str.toCharArray()) {
		//	if (m.containsKey(x)); {
		//		int old = (int) m.get(x);
		//		m.put(x, old + 1);
		//	}
		//	else {
		//		m.put(x, 1);			
		//	}
		//}
		//m.remove(' ');
		
		//System.out.println(m);
		int [] x = {-99, 5, 6, 3, 2, 1, 7, 8, 0};
		
		Arrays.sort(x);//Arrays.sort(Array, from, to) ex: Arrays.sort(x, 1, 7)
		for (int i:x)
		{
			System.out.print(i + ",");
		}
	}
}
