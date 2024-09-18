package practica0;

/*Escribir un programa que pida por pantalla un texto y a continuación lo imprima de atrás para
adelante. Para obtener las letras de una cadena de caracteres pueden utilizar el método charAt
de String. Por ejemplo, cadena.charAt(0) devuelve el primer caracter del String cadena.
*/

import java.util.Scanner;

public class Ejercicio16a {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Ingrese una palabra: ");
		String palabra = scan.nextLine();
		
		for (int i = palabra.length() - 1; i >= 0; i--) {
			System.out.print(palabra.charAt(i));
		}
		
		scan.close();
		

	}

}
