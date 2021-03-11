public class Aula_5 {
	public static void main(String[] args) {
		int x = 6;
		int y = 7;
		int z = 10;
		// > < == >= <= !=
		boolean compare = x < y && z < y; // || == ou ; && == e ;
		boolean compare2 = !(x < y && y > z)|| (z + 3 < 5 || x + 7 > y);
		System.out.println(compare);
	}
}
