package practica0;

/*Escribir un programa que te pregunte por dos números, y a continuación imprima un mensaje
del estilo “El promedio es: ” y el valor del promedio de ambos números.*/

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Ingrese un primer número: ");
		double num1 = scan.nextInt();
		
		System.out.println("Ingrese un segundo número: ");
		double num2 = scan.nextInt();
		
		double promedio = (num1 + num2)/2;
		
		System.out.println("El promedio es: " + promedio);
		
		scan.close();

	}

}
