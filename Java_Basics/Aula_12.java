import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Aula_12 {
	public static void main(String[] args) {
		//Set<Integer> t = new HashSet<Integer>();
		//Set<Integer> t = new TreeSet<Integer>();
		//Set<Integer> t = new LinkedHashSet<Integer>();


		//t.add(5);
		//t.add(7);
		//t.add(5);
		//t.add(9);
		//t.add(-8);
		
		//t.remove(9);
		//t.clear();
		//t.isEmpty();
		//t.size();
		
		//int x = t.size();
		//boolean x = t.contains(5);
		//System.out.println(t);
		
		ArrayList<Integer> t = new ArrayList<Integer>();
		//ArrayList<Integer> t = new LinkedList<Integer>();
		t.add(1);
		t.add(2);
		t.add(1);
		t.add(2);
		t.add(1);
		t.add(2);
		t.get(0);
		t.set(1, 5);
		t.subList(1, 3);
		
		System.out.println(t.subList(1, 3));
		System.out.println(t.subList(1, 4));
		
		
		
		
		
		
		
		
		
		
	}
}
