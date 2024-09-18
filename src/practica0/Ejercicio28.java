package practica0;

//Escribir un método static boolean estaOrdenado(int[] a) que dado un arreglo de enteros,
//devuelve verdadero si el arreglo está ordenado crecientemente de menor a mayor, y falso en caso
//contrario.

public class Ejercicio28 {
	
	public static boolean estaOrdenado(int[] a) {
		
		int menor = a[0];
		
		for (int i = 0; i<a.length; i++) {
			if (menor>a[i]) {
				return false;
			}
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		
		int a[] = new int [4];
		
		a[0] = 2;
		a[1] = 3;
		a[2] = 4;
		a[3] = 5;

		System.out.println(estaOrdenado(a));
		
	}

}
