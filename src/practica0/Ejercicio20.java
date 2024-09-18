package practica0;

//Escribir el método static boolean esCapicua(String s) que dada una cadena, devuelve true
//si la cadena es igual de atrás hacia adelante o de adelante hacia atrás. En caso contrario, devuelve
//false.

import java.util.Scanner;

public class Ejercicio20 {
	
	public static boolean esCapicua (String s) {
		
		String nueva = "";
		
		for (int i = s.length()-1; i>=0; i--) {
			nueva += s.charAt(i);
		}
		
		if (nueva.equals(s)){
			return true;
		}
		else {
			return false;
		}
		
	}

		public static void main(String[] args) {
			
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Ingrese una palabra: ");
		String palabra = scan.nextLine();
		
		System.out.println(esCapicua(palabra));
		
		scan.close();

	}

}