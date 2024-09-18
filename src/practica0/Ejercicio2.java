package practica0;

/*Escribir un programa que te pregunte tu nombre y a continuación imprima un saludo del estilo
“Hola nombre”.*/

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("¿Cómo es su nombre?");
		String nombre = scan.nextLine();
		
		System.out.println("Hola, " + nombre);
		
		scan.close();
		
	}

}
