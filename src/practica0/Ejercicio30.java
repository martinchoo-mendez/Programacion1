package practica0;

/*Escribir las versiones recursivas de los siguientes métodos de la Sección 3:
a) sumatoria: static int sumatoriaRec(int n)
b) sumatoriaPares: static int sumatoriaParesRec(int n)
c) potencia: static int potenciaRec(double x, int n)
d) factorial: static int factorialRec(int n)*/

public class Ejercicio30 {
	
	//a
	public static int sumatoriaRec(int n) {
		if (n==0) {
			return 0;
		}
		else {
			return n + sumatoriaRec (n -1);
		}
	}
	
	//b
	public static int sumatoriaParesRec(int n) {
		if (n==0) {
			return 0;
		}
		if (n%2==0) {
			return n + sumatoriaParesRec(n - 1);
		}
		else {
			return sumatoriaParesRec(n - 1);
		}
	}
	
	//d
	public static int factorialRec(int n) {
		if (n==1) {
			return 1;
		}
		else {
			return n * factorialRec(n - 1);
		}
	}

	public static void main(String[] args) {
		int n = 5;
		System.out.println(sumatoriaRec(n));
		System.out.println(sumatoriaParesRec(n));
		System.out.println(factorialRec(n));
	}

}
