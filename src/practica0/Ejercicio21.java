package practica0;

//Escribir un método static boolean esSinRepetidos(String s) que dada una cadena, devuelve
//true si no hay letras repetidas en la cadena. En caso contrario, devuelve false. No utilizar el método
//del ejercicio 22.

import java.util.Scanner;

public class Ejercicio21 {
	
	public static boolean esSinRepetidos (String s) {
		for (int i = 0; i<s.length(); i++) {
			int cont = 0;
			for (int j = 0; j<s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					cont++;
					if (cont > 1) {
						return false;
					}
				}
				
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Ingrese una palabra: ");
		String palabra = scan.nextLine();
		System.out.println(esSinRepetidos(palabra));
		scan.close();
	}

}
