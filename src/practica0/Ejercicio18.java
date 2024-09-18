package practica0;

//Escribir un método static int cantidadVocales(String s) que dada una cadena que contiene
//sólo letras minúsculas sin acentuar, devuelve la cantidad de vocales en dicha cadena. Nota: se puede
//utilizar el metodo definido en el ejercicio anterior.

import java.util.Scanner;

public class Ejercicio18 {
	
	public static int cantidadVocales (String s) {
		
		int cantVocales = 0;
		s = s.toLowerCase();
		for (int i = 0; i<s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
				cantVocales++;
			}
		}
		
		return cantVocales;
		
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Ingrese una palabra: ");
		String palabra = scan.nextLine();
		
		int vocales = cantidadVocales(palabra);
		
		System.out.println("La palabra " + palabra + " tiene " + vocales + " vocales");
		
		scan.close();
		
	}

}
