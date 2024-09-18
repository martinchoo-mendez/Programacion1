package practica0;

//Escribir un método static int maximoIndice(int[] a) que dado un arreglo de enteros no vacío,
//devuelve el índice del valor más alto que aparece.

public class Ejercicio26 {
	
	public static int maximoIndice (int[] a) {
		
		int max = a[0];
		int maxIndice = 0;
		
		for (int i = 1; i<a.length; i++) {
			if (max < a[i]) {
				maxIndice = i;
			}
		}
		
		return maxIndice;
		
	}

	public static void main(String[] args) {

		int a[] = new int [4];
		
		a[0] = 4;
		a[1] = 2;
		a[2] = 5;
		a[3] = 3;
		
		int mayorIndice = maximoIndice (a);
		
		System.out.println(mayorIndice);

	}

}
