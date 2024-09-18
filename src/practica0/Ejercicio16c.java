package practica0;

//Escribir un método static String reversa(String cadena) que dado un String, devuelve otro
//String con los caracteres invertidos. Por ejemplo, reversa(‘‘hola’’) debería devolver el String
//‘‘ aloh’’.

import java.util.Scanner;

public class Ejercicio16c {
	
	public static String reversa (String cadena) {
		
		String cadnew = "";
		for (int i = 0; i<cadena.length(); i++){
			cadnew = cadena.charAt(i) + cadnew;
		}
		return cadnew;
		
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Ingrese una palabra: ");
		String palabra = scan.nextLine();
		
		System.out.println(reversa(palabra));
		
		scan.close();

	}

}
