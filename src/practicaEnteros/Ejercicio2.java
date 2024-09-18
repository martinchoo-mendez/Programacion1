package practicaEnteros;

/*Implementar la funcion esPrimo que tome un parametro entero y retorne verdadero
 * o falso segun el entero sea primo o no. (*)*/

import java.util.Scanner;

public class Ejercicio2 {

	public static boolean esPrimo(int n) {
		int cantDivisores = 0;
		int i = 1;
		while (i <= n) {
			if (n % i == 0) {
				cantDivisores++;
			}
			i++;
		}
		if (cantDivisores == 2) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		
		Scanner dato = new Scanner (System.in);
		System.out.println("Ingrese un número: ");
		int n = dato.nextInt();

		System.out.println(esPrimo(n));
		
		dato.close();
	}

}
