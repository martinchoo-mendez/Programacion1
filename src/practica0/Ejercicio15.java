package practica0;

/*Escribir un método static boolean esDivisible(int n, int m) que devuelve true si n es divisible por m y false en caso
contrario. Probarlo adecuadamente llam´andola desde el main.*/

import java.util.Scanner;

public class Ejercicio15 {
	
	public static boolean esDivisible (int n, int m) {
		
		if (n%m==0) {
			return true;
		}
		else {
			return false;		}
		
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Ingrese un primer número: ");
		int num1 = scan.nextInt();
		
		System.out.println("Ingrese un segundo número: ");
		int num2 = scan.nextInt();
		
		System.out.println(esDivisible(num1, num2));
		
		scan.close();
		
	}

}
