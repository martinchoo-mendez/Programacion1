package practica0;

/*Una palabra se dice que es “abecedaria” si las letras en la palabra aparecen en orden alfabético.
Por ejemplo, las siguientes son todas palabras abecedarias del idioma castellano.
Por ejemplo: adiós, afín, afinó, ágil, bello, celos, cenó, chinos dijo, dimos, dios, fijos, finos, hijos, hilos,
himno.
Implementar el algoritmo en un método static boolean esAbecedaria(String s)*/

import java.util.Scanner;

public class Ejercicio19 {

	public static boolean esAbecedaria (String s) {
		for (int i = 0; i<s.length()-1; i++) {
			if (s.charAt(i) > s.charAt(i+1)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Ingrese una palabra: ");
		String palabra = scan.nextLine();
		System.out.println(esAbecedaria(palabra));
		scan.close();
	}

}
