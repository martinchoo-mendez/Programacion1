package practica0;

//Escribir un método static int maximo(int[] a) que dado un arreglo de enteros no vacío, devuelve
//el valor más alto que aparece.

public class Ejercicio25 {
	
	public static int maximo (int[] a) {
	
		int maximo = a [0];
		
		for (int i = 1; i<a.length; i++) {
			if (maximo<a[i]) {
				maximo = a[i];
			}
		}
		
		return maximo;
		
	}

	public static void main(String[] args) {
		
		int a[] = new int [4];
		
		a[0] = 4;
		a[1] = 2;
		a[2] = 5;
		a[3] = 7;
		
		int mayor = maximo (a);
		
		System.out.println(mayor);

	}

}
