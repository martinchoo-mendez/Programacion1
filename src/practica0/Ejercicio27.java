package practica0;

//Escribir un método static int suma(int[] a) que dado un arreglo de enteros, devuelve el valor
//de la suma de todos sus elementos.

public class Ejercicio27 {
	
	public static int suma (int[] a) {
		
		int suma = 0;
		
		for (int i = 0; i<a.length; i++) {
			suma += a[i];
		}
		
		return suma;
		
	}

	public static void main(String[] args) {
		
		int a[] = new int [4];
		
		a[0] = 4;
		a[1] = 2;
		a[2] = 5;
		a[3] = 3;

		int sumatoria = suma(a);
		
		System.out.println(sumatoria);
	}

}
