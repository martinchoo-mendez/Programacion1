package practica0;

/*Análogamente al ejercicio anterior, escribir un método static void imprimirPromedio(int a, int b)
que imprima el promedio de los dos parámetros.
*/

import java.util.Scanner;

public class Ejercicio7 {
	
	public static void imprimirPromedio (int a, int b) {
		
		int suma = a + b;
		
		double promedio = suma/2.0;
		
		System.out.println(promedio);
		
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Ingrese un primer número: ");
		int num1 = scan.nextInt();
		
		System.out.println("Ingrese un segundo número: ");
		int num2 = scan.nextInt();
		
		imprimirPromedio(num1, num2);
		
		scan.close();
	}

}
