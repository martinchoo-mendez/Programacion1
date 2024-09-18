package practica0;

/*Escribir un método static double factorial(int n) que toma un entero positivo n y calcula n! (el factorial de n) que se
define como el producto de todos los naturales desde 1 hasta n. Por ejemplo 5! = 5 × 4 × 3 × 2 × 1 = 120.
Ojo: por definici´on, el factorial de 0, es 1 (0! = 1).*/

import java.util.Scanner;

public class Ejercicio13 {
	
	public static double factorial (int n) {
		
		int i = 1;
		double factorial = 1;
		
		while (i<=n) {
			factorial *= i;
			i++;
		}
		
		return factorial;
		
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Ingrese un número: ");
		int num = scan.nextInt();
		
		System.out.println(factorial(num));
		
		scan.close();

	}

}
