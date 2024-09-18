package practica0;

//Escribir un método static int cantidadApariciones(String s, char c) que dada una cadena
//y un caracter, cuenta la cantidad de veces que aparece c en s.

import java.util.Scanner;

public class Ejercicio17 {
	
	public static int cantidadApariciones (String s, char c) {
		
		int contador = 0;
		for (int i = 0; i<s.length(); i++) {
			if (s.charAt(i) == c) {
				contador++;
			}
		}
		return contador;
		
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Ingrese una palabra");
		String palabra = scan.nextLine();
		
		System.out.println("Ingrese una letra");
		char letra = scan.next().charAt(0);
		
		int cantVeces = cantidadApariciones(palabra, letra);
		
		System.out.println("La letra " + letra + " aparece " + cantVeces + " en " + palabra);
		
		scan.close();

	}

}
