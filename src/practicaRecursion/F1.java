package practicaRecursion;

//recursión con enteros

public class F1 {
	
	public static int f3 (int a, int b) {
		return a + b;
	}
	
	public static int f2 (int x, int y) {
		int res = f3 (x, y);
		return res;
	}
	
	public static int f1 (int a, int b) {
		int res = f2 (a, b);
		return res;
	}
			
	public static void main(String[] args) {
		int x = f1 (3, 5);
		int y = f2 (2, 8);
		System.out.println("f1 devuelve: " + x + " y f2 devuelve: " + y);
		
	}

}