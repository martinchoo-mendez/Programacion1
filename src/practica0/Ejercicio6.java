package practica0;

/*Escribir un método static void imprimirSuma(int a, int b) que al igual que el ejercicio 3 imprima la suma de los dos
parámetros. Modificar el programa de dicho ejercicio para que utilice este método.*/

import java.util.Scanner;

public class Ejercicio6 {
	
	public static void imprimirSuma (int a, int b) {
		
		int suma = a + b;
		
		System.out.println(suma);
		
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Ingrese un primer número: ");
		int num1 = scan.nextInt();
		
		System.out.println("Ingrese un segundo número: ");
		int num2 = scan.nextInt();
		
		imprimirSuma(num1, num2);
		
		scan.close();

	}

}
