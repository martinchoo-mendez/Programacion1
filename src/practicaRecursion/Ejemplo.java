package practicaRecursion;

public class Ejemplo {
	
	public static int pow (int x, int n) {
		if (n==0) {
			return 1;
		}
		else {
			int aux = pow(x , n-1);
			return x * aux;
		}
	}

	public static void main(String[] args) {
		int res = pow (2, 4);
		System.out.println("el resultado es: " + res);
	}

}
