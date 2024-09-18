package practica0;

/*Escribir un método static int sumatoria(int n) que devuelve la sumatoria de los números
desde 1 hasta n.*/

import java.util.Scanner;

public class Ejercicio10 {
	
	public static int sumatoria (int n) {
		
		int i = 1;
		int suma = 0;
		
		while (i<=n) {
			suma += i;
			i++;
		}
		
		return suma;
		
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Ingrese un número: ");
		int número = scan.nextInt();
		
		System.out.println(sumatoria(número));
		
		scan.close();

	}

}
