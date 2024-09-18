package recursionArreglos;

public class Ejericicio3 {
	
	public static int cantDivisoresDesde (int n, int d) {
		if (n==d) {
			return 1;
		}
		if (n%d==0) {
			return 1 + cantDivisoresDesde(n, d+1);
		}
		else {
			return 0 + cantDivisoresDesde(n, d+1);
		}
	}
	
	public static int cantDivisores (int n) {
		return cantDivisoresDesde(n, 1);
	}

	public static void main(String[] args) {
		int numero = 10;
		System.out.println(cantDivisores(numero));
	}

}
