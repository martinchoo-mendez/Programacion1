package practica0;

/*Escribir un programa que te pregunte por dos números, y a continuación imprima un mensaje
del estilo “La suma es: ” y el valor de la suma de ambos números. .*/

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese un primer número: ");
		int num1 = scan.nextInt();
		
		System.out.println("Ingrese un segundo número: ");
		int num2 = scan.nextInt();
		
		int suma = num1 + num2;
		
		System.out.println("La suma es: " + suma);
		
		scan.close();

	}

}
