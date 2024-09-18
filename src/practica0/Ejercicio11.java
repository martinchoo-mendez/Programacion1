package practica0;

/*Escribir un método static int sumatoriaPares(int n) que devuelve la sumatoria de los números pares desde 2 hasta n.*/

import java.util.Scanner;

public class Ejercicio11 {
	
	public static int sumatoriaPares (int n) {
		
		int i = 2;
		int sumatoria = 0;
		
		while (i<=n) {
			if (i%2==0) {
				sumatoria += i;
			}
			i++;
		}
		
		return sumatoria;
		
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.println("Ingrese un número: ");
		
		int num = scan.nextInt();
		System.out.println(sumatoriaPares(num));
		
		scan.close();

	}

}
