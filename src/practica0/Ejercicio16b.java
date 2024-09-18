package practica0;

//Mover el código que imprime la cadena al revés a un método
//static void imprimirReversa(String cadena)

import java.util.Scanner;


public class Ejercicio16b {
	
	public static void imprimirReversa(String cadena){
		
		for (int i = cadena.length()-1; i>=0; i--) {
			System.out.print(cadena.charAt(i)); 
		}
		
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Ingrese una palabra: ");
		String palabra = scan.nextLine();
		
		imprimirReversa(palabra);
		
		scan.close();

	}

}
