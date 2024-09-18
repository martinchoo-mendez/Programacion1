package practica0;

//Escribir un método static double promedio(double[] a) que dado un arreglo de números con
//coma, devuelve el valor del promedio de todos los elementos.

public class Ejercicio29 {
	
	public static double promedio (double[] a) {
		
		double suma = 0;
		
		for (int i = 0; i<a.length; i++) {
			suma += a[i];
		}
		
		double promedio = suma/a.length;
		
		return promedio;
		
	}

	public static void main(String[] args) {

		double a[] = new double [4];
		
		a[0] = 2;
		a[1] = 3;
		a[2] = 4;
		a[3] = 5;

		System.out.println(promedio(a));
		
	}

}
